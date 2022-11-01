package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.projects.AddProjectPage;

public class AddNewProjectStep extends BaseStep {

    DashboardPage dashboardPage;
    AddProjectPage addProjectPage;

    public AddNewProjectStep(WebDriver driver) {
        super(driver);
        dashboardPage = new DashboardPage(driver);
        addProjectPage=new AddProjectPage(driver);
    }

    public void addNewProject() {
        dashboardPage.addLinkNewProjectLocator().click();
    }

    public  void saveProject(){
        addProjectPage.getSaveButton().click();
    }
    public void setNameProject(String value){
        addProjectPage.getNameInput().sendKeys(value);
    }
    public void seTCheckBox(){
        addProjectPage.getShowAnnouncement().set();
    }

    public void removeCheckBox(){
        addProjectPage.getShowAnnouncement().remove();
    }

    public void chooseForText(String text){
        addProjectPage.getRadioButton().selectedByText(text);
    }
    public void setText(String value){
        addProjectPage.getInputAnnouncement().sendKeys(value);
    }
    public String getSuccessfulText(){
       return dashboardPage.getsuccessfulLocatorText().getText();
    }
    public void chooseForNumber(int number){
        addProjectPage.getRadioButton().selectByIndex(number);
    }

}
