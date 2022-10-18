package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContainerMenuPage;
import pages.ManeMenuPage;
import pages.LoginPage;
import tests.MainMenuTest;

public class LoginStep extends BaseStep  {
    LoginPage loginPage;
    ManeMenuPage maneMenuPage;
    WebDriverWait wait;
    ContainerMenuPage containerMenuPage;

    public LoginStep(WebDriver driver) {
        super(driver);

        loginPage = new LoginPage(driver);
        maneMenuPage =new ManeMenuPage(driver);

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
    public Boolean logOutTrue(){
        loginPage.getLoginButton().isEnabled();
        return true;
    }



}

