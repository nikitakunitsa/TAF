package elements;

import org.openqa.selenium.*;

public class Link {
    private UIElement uiElement;
    private WebDriver driver;

    public Link(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.driver = driver;
    }

    public Link(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
        this.driver = driver;
    }

    public void click() {
        uiElement.click();
    }
}
