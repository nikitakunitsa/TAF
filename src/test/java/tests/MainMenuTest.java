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
        mainPageStep.addSauceLabsBaskPack();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }
    @Test
    public void addTwoProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSauceLabsBaskPack();
        mainPageStep.addSauceLabsBoltTShirt();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"2");
    }
    @Test
    public void addTheProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addSauceLabsOnesie();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"3");
    }
    @Test
    public void addFourProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsBoltTShirt();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"4");
    }
    @Test
    public void addFiveProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addTShirtRed();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"5");
    }
    @Test
    public void addSixProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceLabsBaskPack();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"6");
    }
    @Test
    public void RemoveOneProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceLabsBaskPack();
        mainPageStep.removeTShirtRed();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }
    @Test
    public void RemoveTwoProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addTShirtRed();
        mainPageStep.removeaddSauceLabsOnesie();
        mainPageStep.removeSauceLabsBikeLight();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }
    @Test
    public void RemoveThreeProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.removeTShirtRed();
        mainPageStep.removeSauceSauceLabsFleeceJacket();
        mainPageStep.removeaddSauceLabsOnesie();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }
    @Test
    public void RemoveFourProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addTShirtRed();
        mainPageStep.removeTShirtRed();
        mainPageStep.removeSauceSauceLabsFleeceJacket();
        mainPageStep.removeaddSauceLabsOnesie();
        mainPageStep.removeSauceLabsBoltTShirt();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }
    @Test
    public void RemoveFiveProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceLabsBaskPack();
        mainPageStep.removeTShirtRed();
        mainPageStep.removeSauceSauceLabsFleeceJacket();
        mainPageStep.removeaddSauceLabsOnesie();
        mainPageStep.removeSauceLabsBoltTShirt();
        mainPageStep.removeSauceLabsBaskPack();
        Assert.assertEquals(mainPageStep.TakeValueOfBasket(),"1");
    }

    @Test
    public void CliclButtonTwitterTest()throws InterruptedException{
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.сlickOnTwiter();
        List<String> windowsHandles=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsHandles.get(windowsHandles.size()-1));
        Assert.assertTrue(driver.getCurrentUrl().equals(ReadProperties.twiter()));
    }
    @Test
    public void CliclButtonFacebook()throws InterruptedException{
        loginStep.loginSuccessful(ReadProperties.usernameStandard(),ReadProperties.password());
        mainPageStep.сlickOnFacebook();
        List<String> windowsHandles=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsHandles.get(windowsHandles.size()-1));
        Assert.assertTrue(driver.getCurrentUrl().equals(ReadProperties.facebook()));
    }
}
