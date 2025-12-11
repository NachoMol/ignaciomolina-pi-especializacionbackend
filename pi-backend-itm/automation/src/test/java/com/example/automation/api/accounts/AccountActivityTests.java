package com.example.automation.api.accounts;

import com.example.automation.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AccountActivityTests extends BaseTest {

    @Test
    public void testGetActivityList() {

        given()
                .header("Authorization", ADMIN_TOKEN)
                .when()
                .get("/api/accounts/1/activity")
                .then()
                .statusCode(200)
                .body("$", notNullValue());
    }

    @Test
    public void testGetActivityDetail() {

        // Primero obtenemos una actividad para obtener un txId
        Integer txId =
                given()
                        .header("Authorization", ADMIN_TOKEN)
                        .when()
                        .get("/api/accounts/1/activity")
                        .then()
                        .statusCode(200)
                        .extract()
                        .path("[0].id");

        given()
                .header("Authorization", ADMIN_TOKEN)
                .when()
                .get("/api/accounts/1/activity/" + txId)
                .then()
                .statusCode(200)
                .body("id", equalTo(txId));
    }
}
