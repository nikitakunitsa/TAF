package steps;

import baseEntities.BaseStep;
import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import pages.AddTestCasePage;
import pages.DashboardPage;

public class AddNewTestCaseStep extends BaseStep {

    AddTestCasePage addTestCasePage;
    DashboardPage dashboardPage;

    public AddNewTestCaseStep(WebDriver driver) {
        super(driver);
        addTestCasePage = new AddTestCasePage(driver);
        dashboardPage = new DashboardPage(driver);

    }

    public void addNewTestCase() {
        dashboardPage.testCasesLink().click();
        dashboardPage.addTestCasesLink().click();
    }

    public void setNameTestCase(String text) {
        addTestCasePage.getNameInput().sendKeys(text);
    }

    public void selectDragAndDownTemplateDropDown(String text) throws InterruptedException {
        addTestCasePage.dragAndDownTemlate().selectDragAndDownTemlate(text);
    }


}
