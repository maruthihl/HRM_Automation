package com.example.orangehrm.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class LoginTest {

    @Test
    public void testLoginAPI() {
        // Use the working endpoint
        RestAssured.baseURI = "https://sandbox.workos.gigin.ai/gateway/auth/signin";

        String payload = """
        {
            "email": "pikeyih214@keevle.com",
            "password": "Maruthi@12300"
        }
        """;

        Response response = given()
                .relaxedHTTPSValidation() // Ignore SSL cert issues if any
                .header("Content-Type", "application/json")
                .header("X-Tenant-Name", "keevlecom")
                .redirects().follow(true) // Follow redirects automatically
                .body(payload)
            .when()
                .post()
            .then()
                .extract()
                .response();

        System.out.println("Response code: " + response.getStatusCode());
        System.out.println("Response body:\n" + response.asPrettyString());

        assertEquals(response.getStatusCode(), 200, "Login API did not return 200 OK");
    }
}
