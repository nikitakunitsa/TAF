package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ContainerMenuPage extends BasePage {

    // Блок описания селекторов для элементов
    private final By pageIndetifer = By.id("react-burger-menu-btn");

    // Блок инициализации страницы
    public ContainerMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageIndetifer;
    }

    // Блок атомарных методов
}
