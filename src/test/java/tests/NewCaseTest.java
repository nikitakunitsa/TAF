package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class NewCaseTest extends BaseTest {


    @Test
    public void someTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.username(),ReadProperties.password());
        addNewTestCaseStep.addCases();
        addNewTestCaseStep.setNameTestCase(ReadProperties.casename());
        addNewTestCaseStep.clickDragAndDownTemplate();
        addNewTestCaseStep.selectDragAndDownTemplate("Test Case (Steps)");
        Thread.sleep(2000);

    }
}
