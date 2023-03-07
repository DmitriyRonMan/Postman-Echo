import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class postmanEchoTest {
    @Test
    void postmanTestV1() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Hello World")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello World"));
    }

}
