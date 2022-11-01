package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DomloadTest extends BaseTest {
    @Test
    public void upploaTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement faildUpload = driver.findElement(By.id("file-upload"));
        String pathToFile = this.getClass().getClassLoader().getResource("test.jpg").getPath().substring(1).replace("%20", " ");
        faildUpload.sendKeys(pathToFile);
        faildUpload.submit();
        Thread.sleep(200);
        Assert.assertTrue(driver.findElement(By.tagName("h3")).getText().equals("File Uploaded!"));
    }
}

