package tests;

import baseEntities.BaseTestOld;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;



public class LoginTest extends BaseTestOld {


    @Test
    public void successLoginTest() {
        loginStep.login(ReadProperties.username(), ReadProperties.password());

        Assert.assertTrue(DashboardPage.isHeaderTitleLabelDisplayed());
    }

    @Test
    public void successLoginTest1() {
        Assert.assertTrue(
                loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password())
                        .isHeaderTitleLabelDisplayed());
    }

    @Test
    public void incorrectUsernameTest() {
        Assert.assertEquals(
                loginStep.loginIncorrect("sdsd", ReadProperties.password())
                        .getErrorTextElement().getText()
                , "Email/Login or Password is incorrect. Please try again.");
    }
}
