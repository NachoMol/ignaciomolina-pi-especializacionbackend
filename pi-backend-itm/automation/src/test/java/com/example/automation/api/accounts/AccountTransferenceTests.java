package com.example.automation.api.accounts;

import com.example.automation.BaseTest;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AccountTransferenceTests extends BaseTest {

    @Test
    public void testSuccessfulTransference() {

        // Asegura una tarjeta válida antes de hacer la transference
        int cardId = ensureCardExists(1);

        JSONObject body = new JSONObject();
        body.put("cardId", cardId);
        body.put("amount", 500.0);

        given()
                .header("Authorization", ADMIN_TOKEN)
                .header("Content-Type", "application/json")
                .body(body.toString())
                .when()
                .post("/api/accounts/1/transferences")
                .then()
                .statusCode(201)
                .body("saldoDisponible", notNullValue());
    }

    @Test
    public void testTransferenceInvalidAmount() {

        int cardId = ensureCardExists(1);

        JSONObject body = new JSONObject();
        body.put("cardId", cardId);
        body.put("amount", -50.0);

        given()
                .header("Authorization", ADMIN_TOKEN)
                .header("Content-Type", "application/json")
                .body(body.toString())
                .when()
                .post("/api/accounts/1/transferences")
                .then()
                .statusCode(400);
    }

    @Test
    public void testTransferenceCardNotFound() {

        JSONObject body = new JSONObject();
        body.put("cardId", 9999);   // siempre no existente
        body.put("amount", 100.0);

        given()
                .header("Authorization", ADMIN_TOKEN)
                .header("Content-Type", "application/json")
                .body(body.toString())
                .when()
                .post("/api/accounts/1/transferences")
                .then()
                .statusCode(400)
                .body(containsString("Tarjeta no encontrada"));
    }
}
