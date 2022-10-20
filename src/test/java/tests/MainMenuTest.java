package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import configuration.ReadProperties;

import java.util.ArrayList;
import java.util.List;


public class MainMenuTest extends BaseTest {


    @Test
    public void addOneProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addOneProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }
    @Test
    public void addTwoProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addTwoProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"2");
    }
    @Test
    public void addTheProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addThereProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"3");
    }
    @Test
    public void addFourProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addFoureProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"4");
    }
    @Test
    public void addFiveProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addFiveProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"5");
    }
    @Test
    public void addSixProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSixProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"6");
    }
    @Test
    public void RemoveOneProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addTwoProductTObasket();
        mainPageStep.removeOneProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }
    @Test
    public void RemoveTwoProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addThereProductTObasket();
        mainPageStep.removeTwoProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }
    @Test
    public void RemoveThreeProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addFoureProductTObasket();
        mainPageStep.removeThreeProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }
    @Test
    public void RemoveFourProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSixProductTObasket();
        mainPageStep.removeFoureProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"2");
    }
    @Test
    public void RemoveFiveProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSixProductTObasket();
        mainPageStep.removeFiveProductTObasket();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }

    @Test
    public void CliclButtonTwitterTest()throws InterruptedException{
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.someClickOnTwiter();
        List<String> windowsHandles=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsHandles.get(windowsHandles.size()-1));
        Assert.assertTrue(driver.getCurrentUrl().equals(ReadProperties.twiter()));
    }
    @Test
    public void CliclButtonFacebook()throws InterruptedException{
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.someClickOnFacebook();
        List<String> windowsHandles=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsHandles.get(windowsHandles.size()-1));
        Assert.assertTrue(driver.getCurrentUrl().equals(ReadProperties.facebook()));
    }
}
