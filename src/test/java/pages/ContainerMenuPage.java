package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContainerMenuPage extends BasePage {

    // Блок описания селекторов для элементов
    private final By pageIndetifer=By.id("react-burger-menu-btn");

    private final By menuItemLocator=By.id("inventory_sidebar_link");
    private final By logOutItemLocator=By.id("logout_sidebar_link");

    private final By deleteAllProductucFromButton=By.id("reset_sidebar_link");

    // Блок инициализации страницы
    public ContainerMenuPage(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return pageIndetifer;
    }
    // Блок атомарных методов
    public WebElement getLogOutItemLocator() {
        return  driver.findElement(logOutItemLocator);
    }
    public void logOutFromMenuPage(){
        getLogOutItemLocator().click();
    }
    public WebElement getDeleteAllProductucFromButton() {
        return driver.findElement(deleteAllProductucFromButton);
    }
    public void deleteProductucFromButton(){
        getDeleteAllProductucFromButton().click();
    }




}
