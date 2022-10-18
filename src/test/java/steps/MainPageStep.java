package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ContainerMenuPage;
import pages.ManeMenuPage;
import tests.MainMenuTest;


public class MainPageStep extends BaseStep {

    ManeMenuPage maneMenuPage;
    ContainerMenuPage containerMenuPage;
    public MainPageStep(WebDriver driver) {
        super(driver);
        maneMenuPage  = new ManeMenuPage(driver);
        containerMenuPage=new ContainerMenuPage(driver);

    }
    public MainMenuTest addOneProductTObasket(){
        maneMenuPage.AddToShoppingCarsStep1Item();
        return null;
    }
    public MainMenuTest removeOneProductTObasket() throws InterruptedException {
        maneMenuPage.RemoveToShoppingCarsStep1Item();
        return null;
    }
    public MainMenuTest addTwoProductTObasket(){
        maneMenuPage.AddToShoppingCarsStep2Item();
        return null;
    }
    public MainMenuTest removeTwoProductTObasket() throws InterruptedException {
        maneMenuPage.RemoveToShoppingCarsStep2Item();
        return null;
    }
    public ManeMenuPage addThereProductTObasket(){
        maneMenuPage.AddToShoppingCarsStep3Item();
        return null;
    }
    public MainMenuTest removeThreeProductTObasket() throws InterruptedException {
        maneMenuPage.RemoveToShoppingCarsStep3Item();
        return null;
    }
    public MainMenuTest addFoureProductTObasket(){
        maneMenuPage.AddToShoppingCarsStep4Item();
        return null;
    }
    public MainMenuTest removeFoureProductTObasket() throws InterruptedException {
        maneMenuPage.RemobeToShoppingCarsStep4Item();
        return null;
    }
    public MainMenuTest addFiveProductTObasket(){
        maneMenuPage.AddToShoppingCarsStep5Item();
        return null;
    }
    public MainMenuTest removeFiveProductTObasket() throws InterruptedException {
        maneMenuPage.RemoveToShoppingCarsStep5Item();
        return null;
    }

    public MainMenuTest addSixProductTObasket(){
        maneMenuPage.AddToShoppingCarsStep6Item();
       return null;
    }
    public MainMenuTest removeSixProductTObasket(){
        maneMenuPage.RemoveToShoppingCarsStep6Item();
        return null;
    }

    public String TakeValueOfBasket(){
        return maneMenuPage.getShoppingCartValueLocators().getText();
    }
    public void clickButtonMenuPage(){
        maneMenuPage.clickContainerMenuPage();
    }
    public void logout(){
        containerMenuPage.logOutFromMenuPage();

    }
    public void someClickOnTwiter(){
        maneMenuPage.twitterClick();
    }
  /* public  boolean falseBukket(){
        maneMenuPage.findbacket();
       return false;
   }*/

}
