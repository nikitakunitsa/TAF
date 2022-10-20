package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private final By pageIndetifer=By.xpath("//*[text()='Checkout']");

    private final By inputForFirstname=By.id("first-name");

    private final By inputForLasttname=By.id("last-name");

    private final By clickContinue=By.id("continue");

    public WebElement getErrorButton() {
        return driver.findElement(errorButton);
    }
    public void gettext(){
        getErrorButton().getText();
    }

    private final By errorButton=By.className("error-button");
    public WebElement  getClickFinish() {
        return driver.findElement(clickFinish);
    }
    public void setClickFinish(){
        getClickFinish().click();
    }


    private final By clickFinish=By.id("finish");

    public WebElement getInputForFirstname() {
        return driver.findElement(inputForFirstname);
    }
    public WebElement getClickContinue() {
        return  driver.findElement(clickContinue);
    }
    public void setClickContinue(){
        getClickContinue().click();
    }

    public WebElement getInputForLasttname() {
        return driver.findElement(inputForLasttname);
    }

    public WebElement getInputForZipcode() {
        return driver.findElement(inputForZipcode);
    }

    private final By inputForZipcode=By.id("postal-code");
    public WebElement buttonCheckout() {
        return driver.findElement(pageIndetifer);
    }
    public void clickButtonCkeckout(){
        buttonCheckout().click();
    }
    public void setFistName(String value){
        getInputForFirstname().sendKeys(value);
    }
    public void setLastName(String value){
        getInputForLasttname().sendKeys(value);
    }
    public void setLastZipCode(String value){
        getInputForZipcode().sendKeys(value);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }
}
