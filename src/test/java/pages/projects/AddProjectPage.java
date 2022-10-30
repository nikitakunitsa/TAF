package pages.projects;

import elements.Button;
import elements.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage extends BaseProjectPage {
    private final By saveButtonLocator = By.id("accept");
    private final By showAnnouncementLocator = By.id("show_announcement");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public Button getSaveButton() {
        return new Button(driver,waitsService.waitForVisibilityBy(saveButtonLocator));
    }
    public void clickSaveButton(){
        getSaveButton().click();
    }
    public CheckBox getShowAnnouncement() { return new CheckBox(driver, showAnnouncementLocator); }

    public void setShowAnnouncement(){
        getShowAnnouncement().set();
    }
    public void removeShowAnnouncement(){
        getShowAnnouncement().remove();
    }
}
