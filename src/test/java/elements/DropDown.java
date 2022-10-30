package elements;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

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
    public  void selectByText(int value){
        Select select=new Select(uiElement);
        select.selectByIndex(value);
    }
    public void click() {
        try {
            uiElement.click();
        } catch (ElementNotInteractableException ex) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uiElement);
            uiElement.click();
        }

    }
}
