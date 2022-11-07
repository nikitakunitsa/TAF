package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private final static String pagePath = "index.php?/dashboard";

    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(text(), 'All Projects')]");

    // Блок атомарных методов
    public WebElement getHeaderTitleLabel() {
        return $(headerTitleLabelLocator);
    }

    public static boolean isHeaderTitleLabelDisplayed() {
        return getHeaderTitleLabel().isDisplayed();
    }
}
