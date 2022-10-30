package pages.projects;

import elements.Button;
import elements.CheckBox;
import elements.Input;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage extends BaseProjectPage {
    private final By saveButtonLocator = By.id("accept");
    private final By showAnnouncementLocator = By.id("show_announcement");
    private final By inputName = By.id("name");
    private final By inputAnnouncement = By.id("announcement");

    private final By radioButton= By.cssSelector("[name='suite_mode']");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public Button getSaveButton() {
        return new Button(driver, waitsService.waitForVisibilityBy(saveButtonLocator));
    }
    public RadioButton getRadioButton(){
        return new RadioButton(driver,waitsService.waitForVisibilityBy(radioButton));
    }


    public Input getInputAnnouncement() {
        return new Input(driver, waitsService.waitForVisibilityBy(inputAnnouncement));
    }

    public CheckBox getShowAnnouncement() {
        return new CheckBox(driver, waitsService.waitForVisibilityBy(showAnnouncementLocator));
    }

    public Input getNameInput() {
        return new Input(driver, waitsService.waitForVisibilityBy(inputName));
    }

}
