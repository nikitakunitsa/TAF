package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input {
    private UIElement uiElement;
    private WebDriver driver;

    public Input(WebDriver driver, By by) {
        this.driver = driver;
        this.uiElement = new UIElement(driver, by);
    }

    public Input(WebDriver driver, WebElement webElement) {
        this.driver = driver;
        this.uiElement = new UIElement(driver, webElement);
    }

    public void sendKeys(CharSequence... keysToSend) {

        uiElement.sendKeys(keysToSend);
    }
}
