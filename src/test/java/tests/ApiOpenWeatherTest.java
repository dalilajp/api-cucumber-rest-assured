package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

public class ApiOpenWeatherTest {

    public void validarRequisicaoPeloNomeCidade() {
        String baseUri = "http://api.openweathermap.org/data/2.5/weather";

        given()
                .log().all()
                .queryParam("q", "London,uk")
                .queryParam("appid", "8e761a09b68a2c854f6950cfc262e099")
                .queryParam("units", "metric")
        .when()
                .get(baseUri)
        .then()
                .log().all()
                .statusCode(200)
                .body("name", is("London"))
                .body("coord.lon", is(-0.1257F))
                .body("main.temp", greaterThan(10f));
    }

    public void validarRequisicaoPeloIdCidade() {
        String baseUri = "http://api.openweathermap.org/data/2.5/weather";

        given()
                .log().all()
                .queryParam("id", "2643743")
                .queryParam("appid", "8e761a09b68a2c854f6950cfc262e099")
                .queryParam("units", "metric")
        .when()
                .get(baseUri)
        .then()
                .log().all()
                .statusCode(200)
                .body("name", is("London"))
                .body("coord.lon", is(-0.1257F))
                .body("main.temp", greaterThan(10f));
    }

    public void validarRequisicaoPelaCoordenadaGeografica() {
        String baseUri = "http://api.openweathermap.org/data/2.5/weather";

        given()
                .log().all()
                .queryParam("lat", "51.5085")
                .queryParam("lon", "-0.1257")
                .queryParam("appid", "8e761a09b68a2c854f6950cfc262e099")
                .queryParam("units", "metric")
        .when()
                .get(baseUri)
        .then()
                .log().all()
                .statusCode(200)
                .body("name", is("London"))
                .body("timezone", is(3600))
                .body("main.temp", greaterThan(10f));
    }

    public void validarRequisicaoPeloCepCidade() {
        String baseUri = "http://api.openweathermap.org/data/2.5/weather";

        given()
                .log().all()
                .queryParam("zip", "94040,us")
                .queryParam("appid", "8e761a09b68a2c854f6950cfc262e099")
                .queryParam("units", "metric")
        .when()
                .get(baseUri)
        .then()
                .log().all()
                .statusCode(200)
                .body("name", is("Mountain View"))
                .body("coord.lon", is(-122.088F))
                .body("main.temp", greaterThan(20F));
    }

    public void validarRequisicaoSemAppId() {
        String baseUri = "http://api.openweathermap.org/data/2.5/weather";

        given()
                .log().all()
                .queryParam("q", "London,uk")
                .queryParam("units", "metric")
        .when()
                .get(baseUri)
        .then()
                .log().all()
                .statusCode(401)
                .body("cod", is(401))
                .body("message", is("Invalid API key. Please see http://openweathermap.org/faq#error401 for more info."));
    }

    public void validarRequisicaoComAppIdInvalido() {
        String baseUri = "http://api.openweathermap.org/data/2.5/weather";

        given()
                .log().all()
                .queryParam("q", "London,uk")
                .queryParam("appid", "8e761a09b68a2c854f6950cfc262e098")
                .queryParam("units", "metric")
        .when()
                .get(baseUri)
        .then()
                .log().all()
                .statusCode(401)
                .body("cod", is(401))
                .body("message", is("Invalid API key. Please see http://openweathermap.org/faq#error401 for more info."));
    }

    public void validarRequisicaoSemNomeCidade(){
        String baseUri = "http://api.openweathermap.org/data/2.5/weather";

        given()
                .log().all()
                .queryParam("appid", "8e761a09b68a2c854f6950cfc262e099")
                .queryParam("units", "metric")
        .when()
                .get(baseUri)
        .then()
                .log().all()
                .statusCode(400)
                .body("cod", is("400"))
                .body("message", is("Nothing to geocode"));
    }
}
