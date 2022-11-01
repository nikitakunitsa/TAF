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
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsBaskPack();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "1");
    }

    @Test
    public void addTwoProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsBaskPack();
        mainPageStep.addSauceLabsBoltTShirt();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "2");
    }

    @Test
    public void addTheProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addSauceLabsOnesie();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "3");
    }

    @Test
    public void addFourProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsBoltTShirt();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "4");
    }

    @Test
    public void addFiveProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addTShirtRed();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "5");
    }

    @Test
    public void addSixProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceLabsBaskPack();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "6");
    }

    @Test
    public void removeOneProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceLabsBaskPack();
        mainPageStep.removeTShirtRed();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "1");
    }

    @Test
    public void removeTwoProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addTShirtRed();
        mainPageStep.removeSauceLabsOnesie();
        mainPageStep.removeSauceLabsBikeLight();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "1");
    }

    @Test
    public void removeThreeProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.removeTShirtRed();
        mainPageStep.removeSauceSauceLabsFleeceJacket();
        mainPageStep.removeSauceLabsOnesie();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "1");
    }

    @Test
    public void removeFourProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addTShirtRed();
        mainPageStep.removeTShirtRed();
        mainPageStep.removeSauceSauceLabsFleeceJacket();
        mainPageStep.removeSauceLabsOnesie();
        mainPageStep.removeSauceLabsBoltTShirt();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "1");
    }

    @Test
    public void removeFiveProductTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceLabsBaskPack();
        mainPageStep.removeTShirtRed();
        mainPageStep.removeSauceSauceLabsFleeceJacket();
        mainPageStep.removeSauceLabsOnesie();
        mainPageStep.removeSauceLabsBoltTShirt();
        mainPageStep.removeSauceLabsBaskPack();
        Assert.assertEquals(mainPageStep.takeValueOfBasket(), "1");
    }

    @Test
    public void clickOnButtonTwitterTest() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.сlickOnTwiter();
        List<String> windowsHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsHandles.get(windowsHandles.size() - 1));
        Assert.assertTrue(driver.getCurrentUrl().equals(ReadProperties.twiter()));
    }

    @Test
    public void clickOnButtonFacebook() throws InterruptedException {
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.сlickOnFacebook();
        List<String> windowsHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsHandles.get(windowsHandles.size() - 1));
        Assert.assertTrue(driver.getCurrentUrl().equals(ReadProperties.facebook()));
    }
}
