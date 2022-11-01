package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AddTestCasePage;
import services.BrowsersService;
import steps.AddNewProjectStep;
import steps.AddNewTestCaseStep;

import steps.LoginStep;


public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;
    protected AddNewProjectStep  addNewProjectStep;
    protected AddNewTestCaseStep addNewTestCaseStep;




    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        driver.get(ReadProperties.getUrl());
        loginStep = new LoginStep(driver);
        addNewProjectStep = new AddNewProjectStep(driver);
        addNewTestCaseStep=new AddNewTestCaseStep(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
