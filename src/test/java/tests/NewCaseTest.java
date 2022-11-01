package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewCaseTest extends BaseTest {
    public NewCaseTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void someTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.username(),ReadProperties.password());
        addNewTestCaseStep.addCases();
        Thread.sleep(1000);

    }
}
