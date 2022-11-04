package pages;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ContainerMenuPage extends BasePage {

    // Блок описания селекторов для элементов
    @FindBy(id = "react-burger-menu-btn")
    public WebElement pageIndetifer;

    // Блок инициализации страницы
    public ContainerMenuPage(WebDriver driver) {
        super(driver);
    }

    // Блок атомарных методов
}
