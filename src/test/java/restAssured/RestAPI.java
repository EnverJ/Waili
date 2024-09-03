package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestAPI {
    @Test
    public void testPostRequest() {
        RestAssured.baseURI = "https://jsonPlaceholder.typicode.com";
        //   String requestBody = "{\"name\":\"Tom\",\"age\":\"23\",\"address\":\"655SStreet\"}";
        Pojo pojo = new Pojo("Enver", 23, "799  Street");
        //sending post request
        Response response = given()
                .header("Content-type", "application/json")
                .body(pojo)
                .when()
                .post("/posts");
        // validate response
        response.then()
                .statusCode(201)
                .body("name", equalTo("Enver"))
                .body("age", equalTo(23));
        //validation the reposne
        Assert.assertEquals(response.statusCode(), 201);
        System.out.println(response.asString());
    }
}