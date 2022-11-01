package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.AddTestCasePage;
import pages.DashboardPage;

public class AddNewTestCaseStep extends BaseStep {

    AddTestCasePage addTestCasePage;
    DashboardPage dashboardPage;

    public AddNewTestCaseStep(WebDriver driver) {
        super(driver);
        addTestCasePage=new AddTestCasePage(driver);
        dashboardPage=new DashboardPage(driver);

    }

    public void setNameTestCase(String name){
        addTestCasePage.getNameInput().sendKeys(name);
    }
    public void selectDragAndDownTemplate(String text) {
        addTestCasePage.dragAndDownTemlate().sendKeys(addTestCasePage.dragAndDownTemlate().selectDragAndDownTemlate(text));
    }
    public void selectDragAndDownTemplate(int index) {
        addTestCasePage.dragAndDownTemlate().sendKeys(addTestCasePage.dragAndDownTemlate().selectDragAndDownTemlate(index));
    }

    public void addCases(){
        dashboardPage.clickTestLocator();
        dashboardPage.clickTestSuitesCases();
        dashboardPage.clickSuitsLocator();
        dashboardPage.clickTestCase();
    }


}
