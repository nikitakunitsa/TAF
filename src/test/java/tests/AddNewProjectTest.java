package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewProjectTest extends BaseTest {

    @Test
    public void addProject()  {
        loginStep.loginSuccessful(ReadProperties.username(),ReadProperties.password());
        addNewProjectStep.addNewProject();
        addNewProjectStep.setNameProject(ReadProperties.projectname());
        addNewProjectStep.setText(ReadProperties.sometext());
        addNewProjectStep.seTCheckBox();
        addNewProjectStep.chooseForNumber(3);
        addNewProjectStep.chooseForText("Use a single repository with baseline support");
        addNewProjectStep.saveProject();
        Assert.assertEquals(ReadProperties.successfullyText(),addNewProjectStep.getSuccesfulText());
    }

}
