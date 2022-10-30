package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class DropDownMenuTest extends BaseTest {
    @Test
    public void someTest(){
        loginStep.loginSuccessful(ReadProperties.username(),ReadProperties.password());
        dropDownSteps.clickDropDownMenu();
        dropDownSteps.selectDropDownMenu(2);

    }
}
