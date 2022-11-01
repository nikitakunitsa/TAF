package elements;

import org.openqa.selenium.*;


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

    public CharSequence selectDragAndDownTemlate(String text) {
        String s = new String();
        switch (text) {
            case "Exploratory Session":
                s=driver.findElement(By.id("template_id_chzn_o_0")).getText();
                ;
            case "Test Case (Steps)":
                s=driver.findElement(By.id("template_id_chzn_o_1")).getText();
                ;
            case "Test Case (Text)":
                s=driver.findElement(By.id("template_id_chzn_o_2")).getText();
        }

        return s;
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



