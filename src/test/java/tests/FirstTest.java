package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import services.AdvancedDriver;
import services.BrowsersService;
import services.SimpleDriver;

public class FirstTest {

    @Test
    public void simpleDriver() throws InterruptedException {
        SimpleDriver simpleDriver=new SimpleDriver();
        WebDriver driver=simpleDriver.getDriver();
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void advancedDriverTest() throws InterruptedException {
        AdvancedDriver advancedDriver=new AdvancedDriver();
        WebDriver driver=advancedDriver.getDriver();
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void BrowsersServicesDriverTest() throws InterruptedException {
        BrowsersService browsersServices =new BrowsersService();
        WebDriver driver=browsersServices.getDriver();
        Thread.sleep(2000);
        driver.quit();
    }

}
