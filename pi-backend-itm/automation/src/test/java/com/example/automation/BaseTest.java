package com.example.automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.given;

public abstract class BaseTest {

    protected static String ADMIN_TOKEN;
    protected static String USER_TOKEN;

    @BeforeAll
    public static void setup() {

        RestAssured.baseURI = "http://localhost:8080";

        // Crear o loguear ADMIN
        ADMIN_TOKEN = "Bearer " + loginOrRegister(
                "admin@local",
                "admin123",
                true  // es admin
        );

        // Crear o loguear USER normal
        USER_TOKEN = "Bearer " + loginOrRegister(
                "user@test.com",
                "testuser123",
                false // no admin
        );
    }

    // ==========================
    // LOGIN / REGISTER AUTOMÁTICO
    // ==========================

    protected static String loginOrRegister(String email, String password, boolean admin) {

        // Intentar login primero
        Response login = given()
                .header("Content-Type", "application/json")
                .body("{\"email\":\"" + email + "\",\"password\":\"" + password + "\"}")
                .post("/api/auth/login");

        if (login.statusCode() == 200) {
            return login.jsonPath().getString("token");
        }

        // Si login falla → registrar usuario con campos correctos
        JSONObject body = new JSONObject();
        body.put("nyap", admin ? "Admin Test" : "User Test");
        body.put("dni", admin ? "90000000" : "80000000");
        body.put("email", email);
        body.put("telefono", "+54 11 2222 2222");
        body.put("password", password);

        Response register = given()
                .header("Content-Type", "application/json")
                .body(body.toString())
                .post("/api/users/register");

        if (register.statusCode() != 201) {
            throw new RuntimeException(
                    "No se pudo registrar usuario: " + email +
                            "\nStatus: " + register.statusCode() +
                            "\nBody: " + register.getBody().asString()
            );
        }

        // Intentar login nuevamente
        Response login2 = given()
                .header("Content-Type", "application/json")
                .body("{\"email\":\"" + email + "\",\"password\":\"" + password + "\"}")
                .post("/api/auth/login");

        return login2.jsonPath().getString("token");
    }

    // ==========================
    // HELPERS PARA TARJETAS
    // ==========================

    protected static Integer ensureCardExists(int accountId) {

        // Revisar si ya hay tarjeta
        Response getCards = given()
                .header("Authorization", ADMIN_TOKEN)
                .get("/api/accounts/" + accountId + "/cards");

        if (getCards.statusCode() == 200 && getCards.jsonPath().getList("$").size() > 0) {
            return getCards.jsonPath().getInt("[0].id");
        }

        // Crear una tarjeta nueva si no existe ninguna
        JSONObject newCard = new JSONObject();
        newCard.put("cardNumber", "411111111111" + (int)(Math.random() * 9000 + 1000));
        newCard.put("holderName", "Test Card");
        newCard.put("expiration", "12/29");
        newCard.put("type", "credito");

        Response create = given()
                .header("Authorization", ADMIN_TOKEN)
                .header("Content-Type", "application/json")
                .body(newCard.toString())
                .post("/api/accounts/" + accountId + "/cards");

        if (create.statusCode() != 201) {
            throw new RuntimeException(
                    "Error creando tarjeta para accountId " + accountId +
                            "\nStatus: " + create.statusCode() +
                            "\nBody: " + create.getBody().asString()
            );
        }

        return create.jsonPath().getInt("id");
    }

    // ==========================
    // HELPERS PARA ACTIVIDADES
    // ==========================

    protected static Integer getAnyActivityId(int accountId) {

        Response resp = given()
                .header("Authorization", ADMIN_TOKEN)
                .get("/api/accounts/" + accountId + "/activity");

        if (resp.statusCode() != 200 || resp.jsonPath().getList("$").isEmpty()) {
            return null;
        }

        return resp.jsonPath().getInt("[0].id");
    }
}
