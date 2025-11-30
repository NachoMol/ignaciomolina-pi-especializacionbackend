package com.example.automation.api.accounts;

import com.example.automation.BaseTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class AccountCardCreationTests extends BaseTest {

    @Test
    public void testCreateCard() {

        String randomCardNumber = "411111111111" + (int)(Math.random() * 9000 + 1000);

        JSONObject json = new JSONObject();
        json.put("cardNumber", randomCardNumber);
        json.put("holderName", "Nacho Molina");
        json.put("expiration", "12/28");
        json.put("type", "credito");

        given()
                .header("Authorization", TOKEN)
                .header("Content-Type", "application/json")
                .body(json.toString())
                .when()
                .post("/api/accounts/1/cards")
                .then()
                .statusCode(201)
                .body("cardNumber", equalTo(randomCardNumber));
    }
}
