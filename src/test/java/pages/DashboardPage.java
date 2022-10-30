package pages;

import baseEntities.BasePage;
import elements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    private final static String pagePath = "index.php?/dashboard";

    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(text(), 'All Projects')]");

    private final By addLinkNewProjectLocator=By.id("sidebar-projects-add");


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
    public void clickNewProject(){
        addLinkNewProjectLocator().click();
    }


    public boolean isHeaderTitleLabelDisplayed() { return getHeaderTitleLabel().isDisplayed(); }
}
