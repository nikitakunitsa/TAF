package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class SmokeTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
    }


    @Test
    public void validateSmokeTest2() throws InterruptedException {
        driver.get("http://13gp.by/informatsiya/meditsinskie-kalkulyatory/995-raschet-skorosti-klubochkovoj-filtratsii-skf");

        WebElement selectWebElement = driver.findElement(By.id("oSex"));
        Select selectSex = new Select(selectWebElement);
        selectSex.selectByVisibleText("женский");
        WebElement ocr = driver.findElement(By.id("oCr"));
        WebElement oage = driver.findElement(By.id("oAge"));
        WebElement oWeight = driver.findElement(By.id("oWeight"));
        WebElement oHeight = driver.findElement(By.id("oHeight"));
        WebElement button = driver.findElement(By.cssSelector("#Form1 > ul > li:nth-child(6) > input[type=button]:nth-child(1)"));
        ocr.sendKeys("80");
        oage.sendKeys("38");
        oWeight.sendKeys("55");
        oHeight.sendKeys("163");
        button.click();
        WebElement MDRD = driver.findElement(By.id("txtMDRD"));
        WebElement MDRD1 = driver.findElement(By.id("txtMDRD1"));
        WebElement CG = driver.findElement(By.id("txtCG"));
        WebElement txtBSA = driver.findElement(By.id("txtBSA"));
        Assert.assertEquals(MDRD.getText(), "MDRD: 74 (мл/мин/1,73кв.м)");
        Assert.assertEquals(MDRD1.getText(), "ХБП: 2 стадия (при наличии почечного повреждения)");
        Assert.assertEquals(CG.getText(), "Cockroft-Gault: 70 (мл/мин)");
        Assert.assertEquals(txtBSA.getText(), "Поверхность тела:1.58 (кв.м)");
    }

    @Test
    public void validateSmokeTest3() {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        WebElement width = driver.findElement(By.id("el_f_width"));
        width.sendKeys("5");
        WebElement lenght = driver.findElement(By.id("el_f_lenght"));
        lenght.sendKeys("15");
        WebElement selectWebElement = driver.findElement(By.id("room_type"));
        Select selectType = new Select(selectWebElement);
        selectType.selectByVisibleText("Кухня или спальня");
        WebElement selectWebElement1 = driver.findElement(By.id("heating_type"));
        Select selectType1 = new Select(selectWebElement1);
        selectType1.selectByVisibleText("Подогрев для комфорта");
        WebElement losses = driver.findElement(By.id("el_f_losses"));
        losses.sendKeys("100");
        WebElement button = driver.findElement(By.cssSelector("#hf_calc > input"));
        button.click();
        WebElement power = driver.findElement(By.id("floor_cable_power"));
        WebElement cablePower = driver.findElement(By.id("spec_floor_cable_power"));
        Assert.assertEquals(power.getAttribute("value"), "56");
        Assert.assertEquals(cablePower.getAttribute("value"), "1");
    }

    @Test
    public void validateSmokeTest4() throws InterruptedException {
        driver.get("https://calc.by/building-calculators/laminate.html");
        WebElement room = driver.findElement(By.id("ln_room_id"));
        room.clear();
        room.sendKeys("500");
        WebElement width = driver.findElement(By.id("wd_room_id"));
        width.clear();
        width.sendKeys("400");
        WebElement longLaminat = driver.findElement(By.id("ln_lam_id"));
        longLaminat.clear();
        longLaminat.sendKeys("2000");
        WebElement widhtLaminat = driver.findElement(By.id("wd_lam_id"));
        widhtLaminat.clear();
        widhtLaminat.sendKeys("200");
        WebElement selectWebelemetn = driver.findElement(By.id("laying_method_laminate"));
        Select selectType = new Select(selectWebelemetn);
        selectType.selectByVisibleText("с использованием отрезанного элемента");
        WebElement directiinLaminat = driver.findElement(By.id("direction-laminate-id1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", directiinLaminat);
        directiinLaminat.click();
        WebElement button = driver.findElement(By.linkText("Рассчитать"));
        button.click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.cssSelector("[style='padding:5px 0;font-size:18px; color:#0E8C19; font-weight:bold;']")).getText(),"7");
        Assert.assertEquals(driver.findElement(By.cssSelector("[style='padding:5px 0;font-size:22px; color:#C80303; font-weight:bold;']")).getText(), "53");
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

}