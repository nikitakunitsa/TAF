package pages;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    // Блок описания селекторов для элементов
    @FindBy(id = "name")
    public WebElement emailInputLocator;
    @FindBy(id = "password")
    public WebElement pswInputLocator;
    @FindBy(id = "button_primary")
    public WebElement loginButtonLocator;
    @FindBy(id = "error-text")
    public WebElement errorTextLocator;

    // Блок инициализации страницы
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    // Блок атомарных методов
    public void setEmail(String value) {
        emailInputLocator.sendKeys(value);
    }

    public void setPsw(String value) {
        pswInputLocator.sendKeys(value);
    }

    public void clickLoginButton() {
        loginButtonLocator.click();
    }

    public WebElement getErrorTextElement() {
        return errorTextLocator;
    }
}
