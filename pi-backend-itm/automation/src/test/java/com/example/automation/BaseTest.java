package com.example.automation;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {

    protected static String TOKEN;

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://localhost:8080";

        TOKEN = "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0M0BtYWlsLmNvbSIsImlhdCI6MTc2NDUxOTYyOSwiZXhwIjoxNzY0NTIzMjI5fQ.mQhUIAS5Aif7HIy44VvC0eouKTAK4jrlEmhZUDq9Tpw"; // Actualizar Bearer con token conseguido de request manual de LOGIN.
    }
}
