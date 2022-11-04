package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManeMenuPage extends BasePage {
    private final static String pagePath = "/inventory.html";


    // Блок описания селекторов для элементов
    @FindBy(xpath = "//*[text()='Products']")
    public WebElement headerTitleLabelLocator;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement sauceLabsBackpackLocator;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement sauceLabsBikeLighLocator;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement sauceLabsBoltTShirtLocator;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement sauceLabsFleeceJackeLocator;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    public WebElement sauceLabsOnesieLocator;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement testallTheThingsTShirtRedLocators;
    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement sauceLabsBackpackLocatorRemove;
    @FindBy(id = "remove-sauce-labs-bike-light")
    public WebElement sauceLabsBikeLighLocatorRemove;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    public WebElement sauceLabsBoltTShirtLocatoRemove;
    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    public WebElement sauceLabsFleeceJackeLocatorRemove;
    @FindBy(id = "remove-sauce-labs-onesie")
    public WebElement sauceLabsOnesieLocatorRemove;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    public WebElement testallTheThingsTShirtRedLocatorsRemove;
    @FindBy(className = "shopping_cart_badge")
    public WebElement shoppingCartValueLocators;
    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCartLink;
    @FindBy(linkText = "Twitter")
    public WebElement twitterClick;
    @FindBy(linkText = "Facebook")
    public WebElement facebookClick;
    public ContainerMenuPage containerMenuPage;

    // Блок инициализации страницы
    public ManeMenuPage(WebDriver driver) {
        super(driver);
        containerMenuPage = new ContainerMenuPage(driver);
    }

    public void twitterClick() {
        twitterClick.click();
    }

    public void facebookClick() {
        facebookClick.click();
    }

    public void removeToShoppingCarsStepSauceLabsBackPack() throws InterruptedException {
        sauceLabsBackpackLocatorRemove.click();
        Thread.sleep(500);
    }

    public void addToShoppingCarsStepSauceLabsBackPack() {
        sauceLabsBackpackLocator.click();
    }

    public void removeToShoppingCarsStepSauceLabsBikeLight() throws InterruptedException {
        sauceLabsBikeLighLocatorRemove.click();
        Thread.sleep(500);
    }

    public void addToShoppingCartStepSauceLabsBoltTShirt() {
        sauceLabsBoltTShirtLocator.click();
    }

    public void removeToShoppingCartStepSauceLabsBoltTShirt() throws InterruptedException {
        sauceLabsBoltTShirtLocatoRemove.click();
        Thread.sleep(500);
    }

    public void addToShoppingCarsStepSauceLabsBikeLight() throws InterruptedException {
        sauceLabsBikeLighLocator.click();
        Thread.sleep(500);
    }


    public void removeToShoppingCartStepSauceSauceLabsFleeceJacket() throws InterruptedException {
        sauceLabsFleeceJackeLocatorRemove.click();
        Thread.sleep(500);
    }

    public void addToShoppingCartStepSauceSauceLabsFleeceJacket() throws InterruptedException {
        sauceLabsFleeceJackeLocator.click();
        Thread.sleep(500);
    }

    public void addToShoppingCartStepSauceLabsOnesie() throws InterruptedException {
        sauceLabsOnesieLocator.click();
        Thread.sleep(500);
    }

    public void removeToShoppingCartStepSauceLabsOnesie() throws InterruptedException {
        sauceLabsOnesieLocatorRemove.click();
        Thread.sleep(500);
    }

    public void addToShoppingCarsStepTShirtRed() {
        testallTheThingsTShirtRedLocators.click();
    }

    public void removeToShoppingCarsStepTShirtRed() {
        testallTheThingsTShirtRedLocatorsRemove.click();
    }

    public WebElement shoppingCartValueLocators() {
        return shoppingCartValueLocators;
    }

    public void clickToCheckoutPage() {
        shoppingCartLink.click();
    }
}




