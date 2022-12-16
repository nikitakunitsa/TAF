package tests.api;

import baseEntities.BaseApiTest;
import models.User;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestRailApiTest2 extends BaseApiTest {
    @Test
    public void getAllUser(){
        User user = User.builder()
                .name("Aleksandr Trostyanko")
                .email("atrostyanko+aqa21@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();
        String endPoint="/index.php?/api/v2/get_users";
        given()
                .when()
                .get(endPoint)
                .then()
                .log().body()
                .body("get(0).name",is(user.getName()))
                .body("get(0).email",equalTo(user.getEmail()))
                .statusCode(HttpStatus.SC_OK);
    }
}
