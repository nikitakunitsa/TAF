package steps;


import org.openqa.selenium.WebDriver;
import pages.ContainerMenuPage;
import pages.ManeMenuPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.page;


public class LoginStep {
    LoginPage loginPage;
    ManeMenuPage maneMenuPage;
    ContainerMenuPage containerMenuPage;


    public LoginStep() {
        loginPage = new LoginPage();
        maneMenuPage = new ManeMenuPage();
        containerMenuPage = new ContainerMenuPage();
    }

    public void login(String user, String psw) {
        loginPage.setEmail(user);
        loginPage.setPsw(psw);
        loginPage.clickLoginButton();
    }

    public ManeMenuPage loginSuccessful(String user, String psw)  {
        login(user, psw);
        return page(ManeMenuPage.class);
    }


    public LoginPage loginIncorrect(String user, String psw) {
        login(user, psw);
        return page(LoginPage.class);
    }
}

