package com.example.orangehrm.base;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.filter.log.LogDetail;

public class BaseTest {

    public static RequestSpecification reqSpec;
    public static ResponseSpecification respSpec;

    // Common setup
    public static void setup() {
        // Request Specification
        reqSpec = new RequestSpecBuilder()
                .setBaseUri("https://i2.dev84.gigin.ai/trpc")
                .addHeader("Content-Type", "application/json")
                .log(LogDetail.ALL)
                .build();

        // Response Specification
        respSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType("application/json")
                .log(LogDetail.ALL)
                .build();
    }
}
