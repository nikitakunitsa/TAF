package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;

public class DropDownSteps extends BaseStep {
    DashboardPage dashboardPage;
    public DropDownSteps(WebDriver driver) {
        super(driver);
        dashboardPage=new DashboardPage(driver);
    }
    public void clickDropDownMenu(){
        dashboardPage.getDropDownMenu().click();
    }
    public void selectDropDownMenu(int value){
        dashboardPage.getDropDownMenu().selectByText(value);
    }
}
