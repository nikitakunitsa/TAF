package pages;

import baseEntities.BasePage;
import elements.Link;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DashboardPage extends BasePage {
    private final static String pagePath = "index.php?/dashboard";

    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(text(), 'All Projects')]");


    private final By testCasesLocator = By.linkText("Test Cases");

    private final By addTestCasesLocator = By.linkText("Add Test Case");

    private final By addNewProjectLocator = By.linkText("Add Project");

    private final By successfulTextLocator = By.className("message-success");
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

    public Link testCasesLink() {
        return new Link(driver, waitsService.waitForVisibilityBy(testCasesLocator));
    }

    public Link addTestCasesLink() {
        return new Link(driver, waitsService.waitForVisibilityBy(addTestCasesLocator));
    }

    public Link addNewProjectLink() {
        return new Link(driver, waitsService.waitForVisibilityBy(addNewProjectLocator));
    }

    public UIElement successfulText() {
        return new UIElement(driver, waitsService.waitForVisibilityBy(successfulTextLocator));
    }

}



