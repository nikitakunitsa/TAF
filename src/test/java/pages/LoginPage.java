package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    // Блок описания селекторов для элементов
    @FindBy(id = "name")
    public SelenideElement emailInputLocator;
    @FindBy(id = "password")
    public SelenideElement pswInputLocator;
    @FindBy(id = "button_primary")
    public SelenideElement loginButtonLocator;
    @FindBy(id = "error-text")
    public SelenideElement errorTextLocator;


    // Блок атомарных методов
    public void setEmail(String value) {
        emailInputLocator.shouldBe(Condition.visible).setValue(value);
    }

    public void setPsw(String value) {
        pswInputLocator.shouldBe(Condition.visible).setValue(value);
    }

    public void clickLoginButton() {
        loginButtonLocator.click();
    }

    public WebElement getErrorTextElement() {
        return errorTextLocator;
    }
}
