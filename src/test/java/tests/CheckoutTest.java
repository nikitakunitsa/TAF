package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import configuration.ReadProperties;
import steps.CheckoutStep;
import steps.LoginStep;
import steps.MainPageStep;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class CheckoutTest extends BaseTest {

    @Test
    public void successCheckoutTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        CheckoutStep checkoutStep = open("", CheckoutStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.goToCheckoutPage();
        checkoutStep.goToContinueCheckout();
        checkoutStep.successfulCheckout(ReadProperties.firstName(), ReadProperties.lastName(), ReadProperties.postalCode());
        checkoutStep.clickToFinishCheckout();
        checkoutStep.finishCheckout();
        webdriver().shouldHave(url(ReadProperties.succsfullCheckout()));
    }
}
