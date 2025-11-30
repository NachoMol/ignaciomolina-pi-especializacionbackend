package com.example.automation.api.users;

import com.example.automation.BaseTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class UserProfileTests extends BaseTest {

    @Test
    public void testUserProfile() {

        given()
                .header("Authorization", TOKEN)
                .when()
                .get("/api/users/1/profile")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("cvu", notNullValue())
                .body("alias", notNullValue())
                .body("saldoDisponible", notNullValue());
    }
}
