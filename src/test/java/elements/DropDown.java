package elements;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import services.WaitsService;


public class DropDown {
    private UIElement uiElement;
    private WebDriver driver;


    public DropDown(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.driver = driver;
    }

    public DropDown(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
        this.driver = driver;

    }

    public void click() {
        uiElement.click();
    }

    public void sendKeys(CharSequence... keysToSend) {

        uiElement.sendKeys(keysToSend);
    }

    public void selectDragAndDownTemlate(String text) throws InterruptedException {
        Actions action=new Actions(driver);
        switch (text) {
            case "Exploratory Session":
                driver.findElement(By.cssSelector("#template_id_chzn input")).sendKeys(driver.findElement(By.id("template_id_chzn_o_0")).getText());
                action.moveToElement(driver.findElement(By.id("template_id_chzn_o_0")),100,100)
                        .click(driver.findElement(By.id("template_id_chzn_o_0")))
                        .build()
                        .perform();
                ;
            case "Test Case (Steps)":
                driver.findElement(By.cssSelector("#template_id_chzn input")).sendKeys(driver.findElement(By.id("template_id_chzn_o_1")).getText());
                driver.findElement(By.id("template_id_chzn_o_1")).click();
                ;
            case "Test Case (Text)":
                driver.findElement(By.cssSelector("#template_id_chzn input")).sendKeys(driver.findElement(By.id("template_id_chzn_o_2")).getText());
                driver.findElement(By.id("template_id_chzn_o_2")).click();
        }
    }
}



