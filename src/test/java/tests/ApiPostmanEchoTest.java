package tests;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;

public class ApiPostmanEchoTest {

    public void validarRequisicaoGET(){
        String baseUri = "https://postman-echo.com/get";

        given()
                .relaxedHTTPSValidation()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
        .when()
                .get(baseUri)
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("headers.host", is("postman-echo.com"))
                .body("args.foo1", containsString("bar"));
    }

    public void validarRequisicaoPOST(){
        String baseUri = "https://postman-echo.com/post";
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .relaxedHTTPSValidation()
                .body(requestBody)
        .when()
                .post(baseUri)
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("data", is("This is expected to be sent back as part of response body."))
                .body("headers.host", is("postman-echo.com"));
    }

    public void validarRequisicaoPUT(){
        String baseUri = "https://postman-echo.com/put";
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .relaxedHTTPSValidation()
                .body(requestBody)
        .when()
                .put(baseUri)
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("data", is("This is expected to be sent back as part of response body."))
                .body("headers.host", is("postman-echo.com"));
    }

    public void validarRequisicaoDELETE(){
        String baseUri = "https://postman-echo.com/delete";
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .relaxedHTTPSValidation()
                .body(requestBody)
        .when()
                .delete(baseUri)
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("data", is("This is expected to be sent back as part of response body."))
                .body("headers.host", is("postman-echo.com"));
    }
}
