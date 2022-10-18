package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManeMenuPage extends BasePage {
    private final static String pagePath = "/inventory.html";


    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//*[text()='Products']");
    private final By SauceLabsBackpackLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By SauceLabsBikeLighLocator = By.id("add-to-cart-sauce-labs-bike-light");
    private final By SauceLabsBoltTShirtLocator = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By SauceLabsFleeceJackeLocator = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private final By SauceLabsOnesieLocator = By.id("add-to-cart-sauce-labs-onesie");
    private final By TestallTheThingsTShirtRedLocators = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private final By SauceLabsBackpackLocatorRemove = By.id("remove-sauce-labs-backpack");
    private final By SauceLabsBikeLighLocatorRemove = By.id("remove-sauce-labs-bike-light");
    private final By SauceLabsBoltTShirtLocatoRemove = By.id("remove-sauce-labs-bolt-t-shirt");
    private final By SauceLabsFleeceJackeLocatorRemove = By.id("remove-sauce-labs-fleece-jacket");
    private final By SauceLabsOnesieLocatorRemove = By.id("remove-sauce-labs-onesie");
    private final By TestallTheThingsTShirtRedLocatorsRemove = By.id("remove-test.allthethings()-t-shirt-(red)");
    private final By ShoppingCartValueLocators = By.className("shopping_cart_badge");
    private final By ContainerMenuPage = By.id("react-burger-menu-btn");
   private final By TwitterClick = By.linkText("Twitter");

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
        return driver.findElement(ContainerMenuPage);
    }

    public void clickContainerMenuPage() {
        getContainerMenuPage().click();
    }


    public WebElement getSauceLabsBackpackLocator() {
        return driver.findElement(SauceLabsBackpackLocator);

    }

    public WebElement getSauceLabsBikeLighLocator() {
        return driver.findElement(SauceLabsBikeLighLocator);
    }

    public WebElement getSauceLabsBoltTShirtLocator() {
        return driver.findElement(SauceLabsBoltTShirtLocator);
    }

    public WebElement getSauceLabsFleeceJackeLocator() {
        return driver.findElement(SauceLabsFleeceJackeLocator);
    }

    public WebElement getSauceLabsOnesieLocator() {
        return driver.findElement(SauceLabsOnesieLocator);
    }

    public WebElement getTestallTheThingsTShirtRedLocators() {
        return driver.findElement(TestallTheThingsTShirtRedLocators);
    }

    public WebElement getTwitterClick() {
        return driver.findElement(TwitterClick);
    }

    public void twitterClick() {
        getTwitterClick().click();
    }

    public WebElement getSauceLabsBackpackLocatorRemove() {
        return driver.findElement(SauceLabsBackpackLocatorRemove);
    }

    public WebElement getSauceLabsBikeLighLocatorRemove() {
        return driver.findElement(SauceLabsBikeLighLocatorRemove);
    }

    public WebElement getSauceLabsBoltTShirtLocatoRemove() {
        return driver.findElement(SauceLabsBoltTShirtLocatoRemove);
    }

    public WebElement getSauceLabsFleeceJackeLocatorRemove() {
        return driver.findElement(SauceLabsFleeceJackeLocatorRemove);
    }

    public WebElement getSauceLabsOnesieLocatorRemove() {
        return driver.findElement(SauceLabsOnesieLocatorRemove);
    }

    public WebElement getTestallTheThingsTShirtRedLocatorsRemove() {
        return driver.findElement(TestallTheThingsTShirtRedLocatorsRemove);
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
        return driver.findElement(ShoppingCartValueLocators);
    }

    //public boolean findbacket(){
    // getShooppnigCartValueEmtyLocors().is;
    // return false;
    //}

}


