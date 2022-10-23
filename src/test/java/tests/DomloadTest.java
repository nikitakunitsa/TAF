package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class DomloadTest extends BaseTest {
    @Test
    public void upploaTest() {
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement faildUpload = driver.findElement(By.id("file-upload"));
        faildUpload.sendKeys("C:/Automation block/TAF/src/test/resources/test.jpg");
        faildUpload.submit();
    }
}

