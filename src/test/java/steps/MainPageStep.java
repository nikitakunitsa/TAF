package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ContainerMenuPage;
import pages.ManeMenuPage;
import tests.MainMenuTest;


public class MainPageStep extends BaseStep {

    ManeMenuPage maneMenuPage;
    ContainerMenuPage containerMenuPage;

    public MainPageStep(WebDriver driver) {
        super(driver);
        maneMenuPage = new ManeMenuPage(driver);
        containerMenuPage = new ContainerMenuPage(driver);

    }

    public ManeMenuPage addSauceLabsBaskPack() {
        maneMenuPage.addToShoppingCarsStepSauceLabsBackPack();
        return maneMenuPage;
    }

    public ManeMenuPage removeSauceLabsBaskPack() throws InterruptedException {
        maneMenuPage.removeToShoppingCarsStepSauceLabsBackPack();
        return maneMenuPage;
    }


    public ManeMenuPage addSauceLabsBikeLight() throws InterruptedException {
        maneMenuPage.addToShoppingCarsStepSauceLabsBikeLight();
        return maneMenuPage;
    }

    public ManeMenuPage removeSauceLabsBikeLight() throws InterruptedException {
        maneMenuPage.removeToShoppingCarsStepSauceLabsBikeLight();
        return maneMenuPage;
    }

    public ManeMenuPage addSauceLabsBoltTShirt() {
        maneMenuPage.addToShoppingCartStepSauceLabsBoltTShirt();
        return maneMenuPage;
    }

    public ManeMenuPage removeSauceLabsBoltTShirt() throws InterruptedException {
        maneMenuPage.removeToShoppingCartStepSauceLabsBoltTShirt();
        return maneMenuPage;
    }

    public ManeMenuPage addSauceSauceLabsFleeceJacket() throws InterruptedException {
        maneMenuPage.addToShoppingCartStepSauceSauceLabsFleeceJacket();
        return maneMenuPage;
    }

    public ManeMenuPage removeSauceSauceLabsFleeceJacket() throws InterruptedException {
        maneMenuPage.removeToShoppingCartStepSauceSauceLabsFleeceJacket();
        return maneMenuPage;
    }

    public ManeMenuPage addSauceLabsOnesie() throws InterruptedException {
        maneMenuPage.addToShoppingCartStepSauceLabsOnesie();
        return maneMenuPage;
    }

    public ManeMenuPage removeaddSauceLabsOnesie() throws InterruptedException {
        maneMenuPage.removeToShoppingCartStepSauceLabsOnesie();
        return maneMenuPage;
    }

    public ManeMenuPage addTShirtRed() {
        maneMenuPage.addToShoppingCarsStepTShirtRed();
        return maneMenuPage;
    }

    public ManeMenuPage removeTShirtRed() {
        maneMenuPage.removeToShoppingCarsStepTShirtRed();
        return maneMenuPage;
    }

    public String TakeValueOfBasket() {
        return maneMenuPage.getShoppingCartValueLocators().getText();
    }

    public void clickButtonMenuPage() {
        maneMenuPage.clickContainerMenuPage();
    }

    public void logout() {
        containerMenuPage.logOutFromMenuPage();

    }

    public void сlickOnTwiter() {
        maneMenuPage.twitterClick();
    }

    public void сlickOnFacebook() {
        maneMenuPage.facebookClick();
    }

    public void goToCheckoutPage() {
        maneMenuPage.clickToCheckoutPage();
    }

}
