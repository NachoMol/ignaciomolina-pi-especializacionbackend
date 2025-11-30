package com.example.automation.api.accounts;

import com.example.automation.BaseTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class AccountCardsTests extends BaseTest {

    @Test
    public void testGetCards() {

        given()
                .header("Authorization", TOKEN)
                .when()
                .get("/api/accounts/1/cards")
                .then()
                .statusCode(200)
                .body("$", notNullValue());
    }

}
