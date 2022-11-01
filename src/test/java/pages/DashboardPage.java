package pages;

import baseEntities.BasePage;
import elements.DropDown;
import elements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    private final static String pagePath = "index.php?/dashboard";

    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(text(), 'All Projects')]");

    private final By addLinkNewProjectLocator=By.id("sidebar-projects-add");

    private final By successfulLocatorText=By.className("message-success");

    private final By dropDownMenu=By.id("navigation-menu");

    private final By testLocators=By.linkText("Tets4");

    private final By testSuitesCasesLocators=By.id("navigation-suites");

    private final By suitsLocator=By.linkText("Master");

    private final By addTestCaseLocators=By.linkText("Add Test Case");
    public TopMenuPage topMenuPage;

    // Блок инициализации страницы
    public DashboardPage(WebDriver driver) {
        super(driver);

        topMenuPage = new TopMenuPage(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getHeaderTitleLabel() { return driver.findElement(headerTitleLabelLocator); }

    public Link  addLinkNewProjectLocator(){
        return new Link(driver,waitsService.waitForVisibilityBy(addLinkNewProjectLocator));
    }
    public DropDown getDropDownMenu(){
        return new DropDown(driver,waitsService.waitForVisibilityBy(dropDownMenu));
    }
    public void clickDropDownMenu(){
        getDropDownMenu().click();
    }
    public WebElement getsuccessfulLocatorText(){
        return driver.findElement(successfulLocatorText);
    }

    public boolean isHeaderTitleLabelDisplayed() { return getHeaderTitleLabel().isDisplayed(); }

    public WebElement getTestLocator(){
       return waitsService.waitForVisibilityBy(driver.findElement(testLocators));
    }

    public void clickTestLocator(){
        getTestLocator().click();
    }
    public WebElement getTestSuitesCases(){
        return waitsService.waitForVisibilityBy(driver.findElement(testSuitesCasesLocators));
    }
    public void clickTestSuitesCases(){
        getTestSuitesCases().click();
    }
    public WebElement getSuitsLocator(){
        return waitsService.waitForVisibilityBy(driver.findElement(suitsLocator));
    }

    public void clickSuitsLocator(){
        getSuitsLocator().click();
    }

    public WebElement getAddTestCaseLocators(){
       return waitsService.waitForVisibilityBy(driver.findElement(addTestCaseLocators));
    }
    public void clickTestCase(){
        getAddTestCaseLocators().click();
    }


}

