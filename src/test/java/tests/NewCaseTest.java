package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class NewCaseTest extends BaseTest {


    @Test
    public void addTestCase() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.username(),ReadProperties.password());
        addNewTestCaseStep.addNewTestCase();
        addNewTestCaseStep.setNameTestCase(ReadProperties.testcasename());
        addNewTestCaseStep.selectDragAndDownTemplateDropDown("Exploratory Session");
        Thread.sleep(4000);
    }
}
