package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;


public class SmokeTest {
    private WebDriver driver;


    @BeforeMethod
    public void start() throws InterruptedException {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
        driver.get(ReadProperties.getUrl());
        driver.findElement(By.id("user-name")).clear();  // поиск по id
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username());
        driver.findElement(By.name("password")).clear(); // поиск имени
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(1000);

    }

    @Test
    public void Test() throws InterruptedException {
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click(); //поиск по cелектору #id
        Thread.sleep(100);
        Assert.assertEquals(driver.findElement(By.cssSelector(".inventory_item_price")).getText(), "$29.99"); // поис по селетору .сlass

    }

    @Test
    public void Test1() {
        Assert.assertEquals(driver.findElements(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory")).size(), 6); // поиск по селектору   .class1.class2
        Assert.assertEquals(driver.findElements(By.cssSelector("[class=inventory_item_price]")).size(), 6); // поиск по селектору   [attribute=value]
        Assert.assertEquals(driver.findElements(By.cssSelector(".inventory_item_description .inventory_item_price")).size(), 6); // поиск по селектору o    .class1 .class2
        Assert.assertEquals(driver.findElements(By.className("inventory_item_name")).size(), 6); // поиск по    classname
    }

    @Test
    public void Test2() throws InterruptedException {
        driver.findElement(By.tagName("ul")); // поиск по  tagname
        driver.findElement(By.linkText("Twitter")).click(); // поиск по  по linkText
        Thread.sleep(1000);
    }

    @Test
    public void Test3() throws InterruptedException {
        driver.findElement(By.partialLinkText("book")).click(); // поиск по  по •  partiallinktext
        Thread.sleep(1000);
    }

    @Test
    public void Test4() throws InterruptedException {
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click(); //поиск по селектору o tagname.class
        Thread.sleep(200);
    }

    @Test
    public void Test5() {
        driver.findElements(By.cssSelector("[id$='ink']")); //поиск по селектору   [attribute$=value]
        Assert.assertEquals(driver.findElements(By.cssSelector("[id|=add]")).size(), 6);  // поиск по селектору o   [attribute|=value]
    }

    @Test
    public void Test6() throws InterruptedException {
        driver.findElement(By.cssSelector("[alt*=Light]")).click(); //поиск по селектору  [attribute*=value]
        Thread.sleep(200);
        driver.findElement(By.cssSelector("[id^=ad]")).click();  // поиск по селектору o   [attribute^=value]
        Assert.assertEquals(driver.findElement(By.cssSelector("[class~=inventory_details_price]")).getText(), "$9.99");//поиск по селектору o   [attribute~=value]
        Thread.sleep(200);
    }

    @Test
    public void Test7() {
        driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//*[contains(@data-test,'light')]")).click();
        driver.findElement(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory' and   @id='add-to-cart-sauce-labs-bolt-t-shirt' ]")).click();
        driver.findElement(By.xpath("//*[text()='Add to cart' and @id='add-to-cart-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.xpath("//*[ contains(text(),'Add') and @id='add-to-cart-sauce-labs-onesie']")).click();
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        Assert.assertEquals(driver.findElement(By.className("shopping_cart_badge")).getText(), "6");
    }

    @Test
    public void Test8() {
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']/ancestor::div[@class='pricebar']/descendant::div")).getText(), "$29.99");
    }

    @Test
    public void Test9() {
        Assert.assertEquals(driver.findElements(By.xpath("//*[@class='inventory_item_label']/following::a")).size(), 13);
        Assert.assertEquals(driver.findElements(By.xpath("//*[@class='inventory_item_label']/preceding::a")).size(), 16);

    }


    @AfterMethod
    public void end() {
        driver.quit();
    }
}

