package tests.api;

import baseEntities.BaseApiTest;
import models.Project;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TestTRailApiTest1 extends BaseApiTest {
    @Test
    public void addProject1(){

        Project expectedProject=Project.builder()
                .name("Wp_progect_01")
                .announcement("Some info")
                .isShowAnnouncement(true)
                .build();
        String endPoin="index.php?/api/v2/add_project";
        Map<String,Object>JsonMap=new HashMap<>();
        JsonMap.put("name",expectedProject.getName());
        JsonMap.put("suite_mode",expectedProject.getTypeOfProject());
        given()
                .body(JsonMap)
                .when()
                .post(endPoin)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }
}
