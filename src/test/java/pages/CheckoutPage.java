package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Checkout']")
    public WebElement pageIndetifer;
    @FindBy(id = "first-name")
    public WebElement inputForFirstname;
    @FindBy(id = "last-name")
    public WebElement inputForLastname;
    @FindBy(id = "continue")
    public WebElement clickContinue;
    @FindBy(id = "postal-code")
    public WebElement inputForZipcode;
    @FindBy(id = "finish")
    public WebElement clickFinish;


    public void clickFinish() {
        clickFinish.click();
    }


    public void clickContinue() {
        clickContinue.click();
    }


    public void clickButtonCheckout() {
        pageIndetifer.click();
    }

    public void setFistName(String value) {
        inputForFirstname.sendKeys(value);
    }

    public void setLastName(String value) {
        inputForLastname.sendKeys(value);
    }

    public void setLastZipCode(String value) {
        inputForZipcode.sendKeys(value);
    }

}


