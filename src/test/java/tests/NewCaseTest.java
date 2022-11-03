package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewCaseTest extends BaseTest {


    @Test
    public void someTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.username(),ReadProperties.password());
        addNewTestCaseStep.addNewTestCase();
        addNewTestCaseStep.setNameTestCase(ReadProperties.testcasename());
        addNewTestCaseStep.selectDragAndDownTemplateDropDown("Exploratory Session");
        Thread.sleep(4000);
    }
}
