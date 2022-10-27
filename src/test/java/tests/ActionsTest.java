package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitsService;
import java.time.Duration;

public class ActionsTest extends BaseTest {

    @Test
    public void contextMenuTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/context_menu");
        WebElement targetBox = driver.findElement(By.id("hot-spot"));
        actions
                .moveToElement(targetBox)
                .contextClick()
                .build()
                .perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().equals("You selected a context menu"));
        alert.accept();
    }

    @Test
    public void disappearingElementsTest() {
        driver.get("http://the-internet.herokuapp.com/disappearing_elements");
        driver.findElement(By.linkText("Home")).click();
        Assert.assertTrue(driver.getCurrentUrl().equals("http://the-internet.herokuapp.com/"));
        driver.get("http://the-internet.herokuapp.com/disappearing_elements");
        driver.findElement(By.linkText("About")).click();
        Assert.assertTrue(driver.getCurrentUrl().equals("http://the-internet.herokuapp.com/about/"));
    }

    @Test
    public void dragAndDropTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/drag_and_drop");
        WebElement targetA = driver.findElement(By.id("column-a"));
        WebElement targetB = driver.findElement(By.id("column-b"));
        DragAndDropJS(targetA, targetB, driver);
        Thread.sleep(5000);
    }

    public void DragAndDropJS(WebElement source, WebElement destination, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("function createEvent(typeOfEvent) {\n"
                + "var event =document.createEvent(\"CustomEvent\");\n"
                + "event.initCustomEvent(typeOfEvent,true, true, null);\n"
                + "event.dataTransfer = {\n" + "data: {},\n" + "setData: function (key, value) {\n" + "this.data[key] = value;\n"
                + "},\n" + "getData: function (key) {\n"
                + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n" + "}\n" + "\n"
                + "function dispatchEvent(element, event,transferData) {\n" + "if (transferData !== undefined) {\n"
                + "event.dataTransfer = transferData;\n" + "}\n" + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
                + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n" + "}\n" + "\n"
                + "function simulateHTML5DragAndDrop(element, destination) {\n" + "var dragStartEvent =createEvent('dragstart');\n"
                + "dispatchEvent(element, dragStartEvent);\n" + "var dropEvent = createEvent('drop');\n"
                + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
                + "var dragEndEvent = createEvent('dragend');\n"
                + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
                + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
                + "simulateHTML5DragAndDrop(source,destination);", source, destination);
    }

    @Test(description = "Не работает драк анд дроп через акшионс")
    public void dragAndDropTes1() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/drag_and_drop");
        WebElement targetA = driver.findElement(By.id("column-a"));
        WebElement targetB = driver.findElement(By.id("column-b"));
        actions
                .moveToElement(targetA)
                .dragAndDrop(targetA, targetB)
                .build()
                .perform();
        Thread.sleep(2000);
    }

    @Test
    public void dynamicControlsTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        WaitsService wait = new WaitsService(driver, Duration.ofSeconds(10));
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement remove = wait.waitForVisibilityBy(driver.findElement(By.xpath("//*[text()='Remove']")));
        actions
                .moveToElement(remove)
                .click()
                .build()
                .perform();
        Assert.assertTrue(wait.waitForVisibilityBy(By.id("message")).getText().equals("It's gone!"));
    }

    @Test
    public void dynamicControlsTest1() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        Actions actions = new Actions(driver);
        WaitsService wait = new WaitsService(driver, Duration.ofSeconds(10));
        WebElement input = driver.findElement((By.cssSelector("[type='text']")));
        Assert.assertTrue(input.isDisplayed());
        WebElement cliclkElement = wait.waitForVisibilityBy(driver.findElement(By.cssSelector("[onclick='swapInput()']")));
        Assert.assertTrue(cliclkElement.isDisplayed());
        actions
                .moveToElement(cliclkElement)
                .click()
                .build()
                .perform();
        Assert.assertTrue(wait.waitForVisibilityBy(By.id("message")).getText().equals("It's enabled!"));
        Assert.assertTrue(cliclkElement.isEnabled());
    }

    @Test
    public void Frame() {
        driver.get("http://the-internet.herokuapp.com/iframe");
        WebElement frameElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(0);
        Assert.assertTrue(driver.findElement(By.xpath("//p[. ='Your content goes here.']")).getText()
                .equals("Your content goes here."));
    }
}


