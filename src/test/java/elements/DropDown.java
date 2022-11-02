package elements;

import org.openqa.selenium.*;
import services.WaitsService;


public class DropDown {
    private UIElement uiElement;
    private WebDriver driver;
    private WaitsService waitsService

    public DropDown(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.driver = driver;
    }

    public DropDown(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
        this.driver = driver;
        this.waitsService = new WaitsService(driver);
    }

    public void selectDragAndDownTemlate(String text) {
        switch (text) {
            case "Exploratory Session":
               waitsService.waitForVisibilityBy(driver,driver.findElement(By.cssSelector("#template_id_chzn .chzn-single")).sendKeys(driver.findElement(By.id("template_id_chzn_o_0")).getText()));
                ;
            case "Test Case (Steps)":
                driver.findElement(By.cssSelector("#template_id_chzn .chzn-single")).sendKeys(driver.findElement(By.id("template_id_chzn_o_1")).getText());
                ;
            case "Test Case (Text)":
                driver.findElement(By.cssSelector("#template_id_chzn .chzn-single")).sendKeys(driver.findElement(By.id("template_id_chzn_o_2")).getText());
        }
    }

   /* public CharSequence selectDragAndDownTemlate(int index) {
        switch (index) {
            case 1:
                 driver.findElement();
                 ;
            case 2:
                 driver.findElement(By.id("template_id_chzn_o_1")).getText();
                 ;
            case 3:
                 driver.findElement(By.id("template_id_chzn_o_2")).getText();
        }
        return ;
    }   */


    public void click() {
        uiElement.click();
    }

    public void sendKeys(CharSequence... keysToSend) {

        uiElement.sendKeys(keysToSend);
    }

}



