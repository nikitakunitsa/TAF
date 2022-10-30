package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.projects.AddProjectPage;

public class AddNewProjectStep extends BaseStep {

    DashboardPage dashboardPage;
    AddProjectPage addNewProjectPage;

    public AddNewProjectStep(WebDriver driver) {
        super(driver);
        dashboardPage = new DashboardPage(driver);
        addNewProjectPage=new AddProjectPage(driver);
    }

    public void addNewProject() {
        dashboardPage.clickNewProject();
    }

    public  void saveProject(){
        addNewProjectPage.clickSaveButton();
    }




}
