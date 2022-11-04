package pages;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    // Блок описания селекторов для элементов
    @FindBy(id = "user-name")
    public WebElement userNameInputLocator;
    @FindBy(id = "password")
    public WebElement pswInputLocator;
    @FindBy(id = "login-button")
    public WebElement loginButtonLocator;
    @FindBy(tagName = "h3")
    public WebElement errorTextLocator;

    // Блок инициализации страницы
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    // Блок атомарных методов


    public void setEmail(String value) {
        userNameInputLocator.sendKeys(value);
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
