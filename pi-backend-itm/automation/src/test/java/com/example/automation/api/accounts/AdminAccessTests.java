package com.example.automation.api.accounts;

import com.example.automation.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AdminAccessTests extends BaseTest {

    @Test
    public void testAdminCanAccessOtherUserActivity() {

        // ADMIN accede a la actividad de la cuenta 1 (que no es suya)
        given()
                .header("Authorization", ADMIN_TOKEN)
                .when()
                .get("/api/accounts/1/activity")
                .then()
                .statusCode(anyOf(is(200), is(204)));
    }

    @Test
    public void testUserCannotAccessOtherUserActivity() {

        // USER intenta acceder a actividad de una cuenta ajena (1)
        given()
                .header("Authorization", USER_TOKEN)
                .when()
                .get("/api/accounts/1/activity")
                .then()
                .statusCode(403);
    }
}
