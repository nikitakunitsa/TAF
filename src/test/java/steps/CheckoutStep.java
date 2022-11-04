package steps;

import baseEntities.BaseStep;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import pages.ManeMenuPage;

public class CheckoutStep extends BaseStep {

    ManeMenuPage maneMenuPage;

    CheckoutPage checkoutPage;

    public CheckoutStep(WebDriver driver) {
        super(driver);
        maneMenuPage = new ManeMenuPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    public CheckoutPage goToContinueCheckout() {
        checkoutPage.clickButtonCheckout();
        return checkoutPage;
    }

    public CheckoutPage successfulCheckout(String firstName, String lastname, String zipCode) {
        checkoutPage.setFistName(firstName);
        checkoutPage.setLastName(lastname);
        checkoutPage.setLastZipCode(zipCode);
        return checkoutPage;
    }

    public CheckoutPage clickToFinishCheckout() {
        checkoutPage.clickContinue();
        return checkoutPage;
    }

    public CheckoutPage finishCheckout() {
        checkoutPage.clickFinish();
        return checkoutPage;
    }
}
