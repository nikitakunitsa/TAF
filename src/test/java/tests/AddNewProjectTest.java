package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewProjectTest extends BaseTest {


    @Test
    public void addProjectTest() {
        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        addNewProjectStep.addNewProject();
        addNewProjectStep.setNameProject(ReadProperties.projectname());
        addNewProjectStep.setText(ReadProperties.sometext());
        addNewProjectStep.seTCheckBox();
        addNewProjectStep.chooseForText("Use a single repository with baseline support");
        addNewProjectStep.chooseForNumber(3);
        addNewProjectStep.saveProject();
        Assert.assertEquals(ReadProperties.successfullyText(), addNewProjectStep.getSuccessfulText());

    }
}
