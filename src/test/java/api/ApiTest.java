package api;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;

public class ApiTest {

    @Test
    public void testCreateUser() {
        RestAssured.baseURI = "https://demoqa.com";

        String requestBody = "{"
                + "\"userName\": \"Roma\","
                + "\"password\": \"Adewdew123!\""
                + "}";

        given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("/Account/v1/User")
                .then()
                .statusCode(anyOf(is(201), is(406)))
                .body("message", anyOf(nullValue(), is("User exists!")));
    }

    @Test
    public void testAuthentication() {
        RestAssured.baseURI = "https://demoqa.com";

        String requestBody = "{"
                + "\"userName\": \"Roma\","
                + "\"password\": \"Adewdew123!\""
                + "}";

        given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("/Account/v1/Authorized")
                .then()
                .statusCode(200);
    }

    @Test
    public void testBooks() {
        RestAssured.baseURI = "https://demoqa.com";


        given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .get("/BookStore/v1/Books")
                .then()
                .statusCode(200);
    }
}
