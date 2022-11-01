package pages;

import baseEntities.BasePage;
import elements.DropDown;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTestCasePage extends BasePage {

    private final By nameLocator = By.id("title");
    private final By dragAndDownTemlateLocator = By.id("template_id_chzn");
    private final By dragAndDownTypeLocator = By.id("type_id_chzn");


    public AddTestCasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public Input getNameInput() {
        return new Input(driver, waitsService.waitForVisibilityBy(nameLocator));
    }

    public DropDown dragAndDownTemlate() {
        return new DropDown(driver, waitsService.waitForVisibilityBy(dragAndDownTemlateLocator));
    }

    public DropDown dragAndDownType() {
        return new DropDown(driver, waitsService.waitForVisibilityBy(dragAndDownTypeLocator));
    }

    public void clickOnDragAndDownTemlate() {
        dragAndDownTemlate().click();
    }

    public void clickOnDragAndDownType() {
        dragAndDownType().click();
    }


}



