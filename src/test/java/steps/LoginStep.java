package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ContainerMenuPage;
import pages.ManeMenuPage;
import pages.LoginPage;


public class LoginStep extends BaseStep {
    LoginPage loginPage;
    ManeMenuPage maneMenuPage;
    ContainerMenuPage containerMenuPage;


    public LoginStep(WebDriver driver) {
        super(driver);

        loginPage = new LoginPage(driver);
        maneMenuPage = new ManeMenuPage(driver);
        containerMenuPage = new ContainerMenuPage(driver);
    }

    public void login(String user, String psw) {
        loginPage.setEmail(user);
        loginPage.setPsw(psw);
        loginPage.clickLoginButton();
    }

    public ManeMenuPage loginSuccessful(String user, String psw) throws InterruptedException {
        login(user, psw);
        Thread.sleep(1000);
        return new ManeMenuPage(driver);
    }

    public LoginPage loginIncorrect(String user, String psw) {
        login(user, psw);
        return loginPage;

    }
}

