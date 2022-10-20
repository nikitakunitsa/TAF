package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManeMenuPage extends BasePage {
    private final static String pagePath = "/inventory.html";


    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//*[text()='Products']");
    private final By sauceLabsBackpackLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By sauceLabsBikeLighLocator = By.id("add-to-cart-sauce-labs-bike-light");
    private final By sauceLabsBoltTShirtLocator = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By sauceLabsFleeceJackeLocator = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private final By sauceLabsOnesieLocator = By.id("add-to-cart-sauce-labs-onesie");
    private final By testallTheThingsTShirtRedLocators = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private final By sauceLabsBackpackLocatorRemove = By.id("remove-sauce-labs-backpack");
    private final By sauceLabsBikeLighLocatorRemove = By.id("remove-sauce-labs-bike-light");
    private final By sauceLabsBoltTShirtLocatoRemove = By.id("remove-sauce-labs-bolt-t-shirt");
    private final By sauceLabsFleeceJackeLocatorRemove = By.id("remove-sauce-labs-fleece-jacket");
    private final By sauceLabsOnesieLocatorRemove = By.id("remove-sauce-labs-onesie");
    private final By testallTheThingsTShirtRedLocatorsRemove = By.id("remove-test.allthethings()-t-shirt-(red)");
    private final By shoppingCartValueLocators = By.className("shopping_cart_badge");
    private final By shoppingCartLink=By.className("shopping_cart_link");
    private final By containerMenuPageLink = By.id("react-burger-menu-btn");
    private final By twitterClick = By.linkText("Twitter");
    private final By facebookClick = By.linkText("Facebook");

    public ContainerMenuPage containerMenuPage;

    // Блок инициализации страницы
    public ManeMenuPage(WebDriver driver) {
        super(driver);
        containerMenuPage = new ContainerMenuPage(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public WebElement getContainerMenuPage() {
        return driver.findElement(containerMenuPageLink);
    }

    public void clickContainerMenuPage() {
        getContainerMenuPage().click();
    }

    public WebElement getShoppingCartLink() {
        return driver.findElement(shoppingCartLink);
    }
    public void clickToCheckoutPage(){
        getShoppingCartLink().click();
    }


    public WebElement getSauceLabsBackpackLocator() {
        return driver.findElement(sauceLabsBackpackLocator);

    }

    public WebElement getSauceLabsBikeLighLocator() {
        return driver.findElement(sauceLabsBikeLighLocator);
    }

    public WebElement getSauceLabsBoltTShirtLocator() {
        return driver.findElement(sauceLabsBoltTShirtLocator);
    }

    public WebElement getSauceLabsFleeceJackeLocator() {
        return driver.findElement(sauceLabsFleeceJackeLocator);
    }

    public WebElement getSauceLabsOnesieLocator() {
        return driver.findElement(sauceLabsOnesieLocator);
    }

    public WebElement getTestallTheThingsTShirtRedLocators() {
        return driver.findElement(testallTheThingsTShirtRedLocators);
    }

    public WebElement getTwitterClick() {
        return driver.findElement(twitterClick);
    }

    public void twitterClick() {
        getTwitterClick().click();
    }
    public WebElement  getFacebookClick() {
        return driver.findElement(facebookClick);
    }
    public void facebookClick() {
        getFacebookClick().click();
    }

    public WebElement getSauceLabsBackpackLocatorRemove() {
        return driver.findElement(sauceLabsBackpackLocatorRemove);
    }

    public WebElement getSauceLabsBikeLighLocatorRemove() {
        return driver.findElement(sauceLabsBikeLighLocatorRemove);
    }

    public WebElement getSauceLabsBoltTShirtLocatoRemove() {
        return driver.findElement(sauceLabsBoltTShirtLocatoRemove);
    }

    public WebElement getSauceLabsFleeceJackeLocatorRemove() {
        return driver.findElement(sauceLabsFleeceJackeLocatorRemove);
    }

    public WebElement getSauceLabsOnesieLocatorRemove() {
        return driver.findElement(sauceLabsOnesieLocatorRemove);
    }

    public WebElement getTestallTheThingsTShirtRedLocatorsRemove() {
        return driver.findElement(testallTheThingsTShirtRedLocatorsRemove);
    }

    public void RemoveToShoppingCarsStep1Item() throws InterruptedException {
        getSauceLabsBackpackLocatorRemove().click();
        Thread.sleep(500);
    }

    public void AddToShoppingCarsStep1Item() {
        getSauceLabsBackpackLocator().click();
    }

    public void RemoveToShoppingCarsStep2Item() throws InterruptedException {
        getSauceLabsBackpackLocatorRemove().click();
        getSauceLabsBikeLighLocatorRemove().click();
        Thread.sleep(500);
    }

    public void AddToShoppingCarsStep2Item() {
        getSauceLabsBackpackLocator().click();
        getSauceLabsBikeLighLocator().click();
    }

    public void AddToShoppingCarsStep3Item() {
        getSauceLabsBackpackLocator().click();
        getSauceLabsBikeLighLocator().click();
        getSauceLabsBoltTShirtLocator().click();
    }

    public void RemoveToShoppingCarsStep3Item() throws InterruptedException {
        getSauceLabsBackpackLocatorRemove().click();
        getSauceLabsBikeLighLocatorRemove().click();
        getSauceLabsBoltTShirtLocatoRemove().click();
        Thread.sleep(500);
    }

    public void AddToShoppingCarsStep4Item() {
        getSauceLabsBackpackLocator().click();
        getSauceLabsBikeLighLocator().click();
        getSauceLabsBoltTShirtLocator().click();
        getSauceLabsOnesieLocator().click();
    }

    public void RemobeToShoppingCarsStep4Item() throws InterruptedException {
        getSauceLabsBackpackLocatorRemove().click();
        getSauceLabsBikeLighLocatorRemove().click();
        getSauceLabsBoltTShirtLocatoRemove().click();
        getSauceLabsOnesieLocatorRemove().click();
        Thread.sleep(500);
    }

    public void AddToShoppingCarsStep5Item() {
        getSauceLabsBackpackLocator().click();
        getSauceLabsBikeLighLocator().click();
        getSauceLabsBoltTShirtLocator().click();
        getSauceLabsOnesieLocator().click();
        getSauceLabsFleeceJackeLocator().click();
    }

    public void RemoveToShoppingCarsStep5Item() throws InterruptedException {
        getSauceLabsBackpackLocatorRemove().click();
        getSauceLabsBikeLighLocatorRemove().click();
        getSauceLabsBoltTShirtLocatoRemove().click();
        getSauceLabsOnesieLocatorRemove().click();
        getSauceLabsFleeceJackeLocatorRemove().click();
        Thread.sleep(500);
    }

    public void AddToShoppingCarsStep6Item() {
        getSauceLabsBackpackLocator().click();
        getSauceLabsBikeLighLocator().click();
        getSauceLabsBoltTShirtLocator().click();
        getSauceLabsOnesieLocator().click();
        getSauceLabsFleeceJackeLocator().click();
        getTestallTheThingsTShirtRedLocators().click();
    }
    public void RemoveToShoppingCarsStep6Item() {
        getSauceLabsBackpackLocatorRemove().click();
        getSauceLabsBikeLighLocatorRemove().click();
        getSauceLabsBoltTShirtLocatoRemove().click();
        getSauceLabsOnesieLocatorRemove().click();
        getSauceLabsFleeceJackeLocatorRemove().click();
        getTestallTheThingsTShirtRedLocatorsRemove().click();
    }
    public WebElement getShoppingCartValueLocators() {
        return driver.findElement(shoppingCartValueLocators);
    }
}


