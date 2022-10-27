package steps;

import baseEntities.BaseStep;
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

    public void goToContunieCheckout() {
        checkoutPage.clickButtonCkeckout();
    }

    public void SuccefulCheckout(String firstName, String lastname, String zipCode) {
        checkoutPage.setFistName(firstName);
        checkoutPage.setLastName(lastname);
        checkoutPage.setLastZipCode(zipCode);
    }

    public void clickToFinishCheckout() {
        checkoutPage.setClickContinue();
    }

    public void finishCheckout() {
        checkoutPage.setClickFinish();
    }
}
