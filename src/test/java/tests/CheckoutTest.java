package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.ReadProperties;

public class CheckoutTest extends BaseTest {

    @Test
    public void successCheckoutTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.goToCheckoutPage();
        checkoutStep.goToContinueCheckout();
        checkoutStep.successfulCheckout(ReadProperties.firstName(), ReadProperties.lastName(), ReadProperties.postalCode());
        checkoutStep.clickToFinishCheckout();
        checkoutStep.finishCheckout();
        Assert.assertTrue(driver.getCurrentUrl().equals(ReadProperties.succsfullCheckout()));
    }

}
