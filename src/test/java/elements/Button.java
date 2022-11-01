package elements;

import org.openqa.selenium.*;

public class Button {
    private UIElement uiElement;
    private WebDriver driver;


    public Button(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.driver = driver;
    }

    public Button(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
        this.driver = driver;
    }


    public void click() {
        uiElement.click();
    }
}
