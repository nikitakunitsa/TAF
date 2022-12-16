package tests.api;

import baseEntities.BaseApiTest;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Project;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TestTRailApiTest1 extends BaseApiTest {
    private int projectID;
    @Test
    public void addProject1() {

        Project expectedProject = Project.builder()
                .name("Wp_progect_01")
                .announcement("Some info")
                .isShowAnnouncement(true)
                .TypeOfProject(1)
                .build();
        String endPoin = "index.php?/api/v2/add_project";
        given()
                .body(String.format("{\n" +
                                "  \"name\": \"%s\",\n" +
                                "  \"announcement\": \"%s\",\n" +
                                "  \"show_announcement\": %b,\n" +
                                "  \"suite_mode\" : %d\n" +
                                "}",
                        expectedProject.getName(),
                        expectedProject.getAnnouncement(),
                        expectedProject.isShowAnnouncement(),
                        expectedProject.getTypeOfProject()
                ))
                .when()
                .post(endPoin)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);

        /*String endPoin="index.php?/api/v2/add_project";
        Map<String,Object>JsonMap=new HashMap<>();
        JsonMap.put("name",expectedProject.getName());
        JsonMap.put("suite_mode",expectedProject.getTypeOfProject());
        given()
                .body(JsonMap)
                .when()
                .post(endPoin)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);*/
    }

    @Test
    public void addProject2() {

        Project expectedProject = Project.builder()
                .name("Wp_progect_01")
                .announcement("Some info")
                .isShowAnnouncement(true)
                .TypeOfProject(1)
                .build();
        String endPoin = "index.php?/api/v2/add_project";
        Map<String, Object> JsonMap = new HashMap<>();
        JsonMap.put("name", expectedProject.getName());
        JsonMap.put("suite_mode", expectedProject.getTypeOfProject());
        given()
                .body(JsonMap)
                .when()
                .post(endPoin)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);

    }

    @Test
    public void addProject3() {

        Project expectedProject = Project.builder()
                .name("Wp_progect_03")
                .announcement("Some info")
                .isShowAnnouncement(true)
                .TypeOfProject(1)
                .build();
        String endPoin = "index.php?/api/v2/add_project";

        given()
                .body(expectedProject, ObjectMapperType.GSON)
                .log().body()
                .when()
                .post(endPoin)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }
    @Test
    public void addProject4() {

        Project expectedProject = Project.builder()
                .name("Wp_progect_03")
                .announcement("Some info")
                .isShowAnnouncement(true)
                .TypeOfProject(1)
                .build();
        String endPoin = "index.php?/api/v2/add_project";

        int projectID=given()
                .body(expectedProject, ObjectMapperType.GSON)
                .log().body()
                .when()
                .post(endPoin)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().get("id");
        System.out.println(projectID);
    }
    @Test
    public void addProject5() {

        Project expectedProject = Project.builder()
                .name("Wp_progect_03")
                .announcement("Some info")
                .isShowAnnouncement(true)
                .TypeOfProject(1)
                .build();
        String endPoin = "index.php?/api/v2/add_project";

        Response response =given()
                .body(expectedProject, ObjectMapperType.GSON)
                .log().body()
                .when()
                .post(endPoin)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        System.out.println(response);

        Assert.assertEquals(response.getBody().jsonPath().get("name"),expectedProject.getName());
    }
    @Test(dependsOnMethods = "addProject4")
    public void updateProject(){
        String endpoint="index.php?/api/v2/update_project/{project_id}";
        Project expectedProject = Project.builder()
                .name("Wp_progect_03")
                .announcement("Some info")
                .isShowAnnouncement(true)
                .TypeOfProject(1)
                .build();
        given()
                .pathParams("project_id",projectID)
                .body(expectedProject, ObjectMapperType.GSON)
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }
}

