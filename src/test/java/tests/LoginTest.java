package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ManeMenuPage;


public class LoginTest extends BaseTest {
    @Test
    public void successLoginTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        Assert.assertTrue(new ManeMenuPage(driver).isPageOpened());
    }

    @Test
    public void LockedOutUsernameTest() {
        Assert.assertEquals(loginStep.loginIncorrect(ReadProperties.usernameBlocked(), ReadProperties.password()).
                getErrorTextElement().getText(), "Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    public void ProblemUsernameTest() {
        loginStep.loginIncorrect(ReadProperties.usernameProblem(), ReadProperties.password());
        Assert.assertTrue(new ManeMenuPage(driver).isPageOpened());
    }

    @Test
    public void PerformanceGlitchTest() {
        loginStep.loginIncorrect(ReadProperties.usernamePerformanceGlitch(), ReadProperties.password());
        Assert.assertTrue(new ManeMenuPage(driver).isPageOpened());
    }

    @Test
    public void incorrectPswTest() {
        Assert.assertEquals(loginStep.loginIncorrect(ReadProperties.usernameBlocked(), "2000").
                getErrorTextElement().getText(), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void incorrectUserTest() {
        Assert.assertEquals(loginStep.loginIncorrect("some name", ReadProperties.password()).
                getErrorTextElement().getText(), "Epic sadface: Username and password do not match any user in this service");
    }
}
