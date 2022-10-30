package elements;

import org.openqa.selenium.*;

public class RadioButton {
    private UIElement uiElement;
    private WebDriver driver;


    public RadioButton(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.driver = driver;
    }
    public RadioButton(WebDriver driver,WebElement webElement){
        this.uiElement = new UIElement(driver, webElement);
        this.driver = driver;
    }
    public  void chouseForSerialNumber(String VisibleText){
        if (VisibleText=="Use multiple test suites to manage cases"){
            try {
                driver.findElement(By.xpath("//*[text()='Use multiple test suites to manage cases']")).click();}
            catch (ElementNotInteractableException ex) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[text()='Use multiple test suites to manage cases']")));
                driver.findElement(By.xpath("//*[text()='Use multiple test suites to manage cases']")).click();
            }
        }
        else if(VisibleText=="Use a single repository with baseline support"){
            try {
                driver.findElement(By.xpath("//*[text()='Use a single repository with baseline support']")).click();}
            catch (ElementNotInteractableException ex) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[text()='Use multiple test suites to manage cases']")));
                driver.findElement(By.xpath("//*[text()='Use a single repository with baseline support']")).click();
            }
        }
        else if(VisibleText=="Use a single repository for all cases (recommended)"){
            try {
                driver.findElement(By.xpath("//*[text()='Use a single repository for all cases (recommended)']")).click();}
            catch (ElementNotInteractableException ex) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[text()='Use multiple test suites to manage cases']")));
                driver.findElement(By.xpath("//*[text()='Use a single repository for all cases (recommended)']")).click();
            }
        }
    }

    public  void chouseForNumber(int number){
        if (number==1){
            try {
                driver.findElement(By.id("suite_mode_single")).click();}
            catch (ElementNotInteractableException ex) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("suite_mode_single")));
                driver.findElement(By.id("suite_mode_single")).click();
            }
        }
        else if(number==2){
            try {
                driver.findElement(By.id("suite_mode_single_baseline")).click();}
            catch (ElementNotInteractableException ex) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("suite_mode_single_baseline")));
                driver.findElement(By.id("suite_mode_single_baseline")).click();
            }
        }
        else if(number==3){
            try {
                driver.findElement(By.id("suite_mode_multi")).click();}
            catch (ElementNotInteractableException ex) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("suite_mode_multi)")));
                driver.findElement(By.id("suite_mode_multi")).click();
            }
        }
    }


}



    