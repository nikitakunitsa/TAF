package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContainerMenuPage;
import services.BrowsersService;
import steps.CheckoutStep;
import steps.LoginStep;
import steps.MainPageStep;
public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;
    protected MainPageStep mainPageStep;
    protected ContainerMenuPage containerMenuPage;
    protected CheckoutStep checkoutStep;
    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        driver.get(ReadProperties.getUrl());

        loginStep =new LoginStep(driver);
        mainPageStep=new MainPageStep(driver);
        containerMenuPage=new ContainerMenuPage(driver);
        checkoutStep=new CheckoutStep(driver);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
