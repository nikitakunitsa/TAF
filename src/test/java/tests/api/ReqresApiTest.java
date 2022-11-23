package tests.api;

import com.google.errorprone.annotations.RestrictedApi;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqresApiTest {

    @Test
    public void simpleStepByStepApiTest(){
        RestAssured.baseURI="https://reqres.in";

        int userId=2;
        String endpoint="/api/users/"+userId;

        RequestSpecification hhtpPequest=given();

        Response response=hhtpPequest.request(Method.GET,endpoint);

        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);
        Assert.assertEquals(statusCode, HttpStatus.SC_OK);

        String responceBody=response.getBody().asString();
}

    @Test
    public void simpleShortApiTest(){
        RestAssured.baseURI="https://reqres.in";

        int userId=2;
        String endpoint="/api/users/"+userId;

        given()
                .when()
                .get(endpoint)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body();

    }
}

