import Data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest extends BaseTest {
    @Test
    public void testDivforInt() {
        Assert.assertEquals(calculator.div(4, 2), 2, " Сalculator made a mistake");
    }

    @Test
    public void testDivFailforInt() {
        Assert.assertEquals(calculator.div(4, 1), 2, "Сalculator made a mistake");
    }


    @Test
    public void testDivforDouble() {
        Assert.assertEquals(calculator.div(3.3, 2.75), 1.2, " Сalculator made a mistake");
        System.out.println("Test is okay");
    }

    @Test
    public void testDivFailforDouble() {
        Assert.assertEquals(calculator.div(3.3, 2.75), 5.16, " Сalculator made a mistake");
    }

    @Test(enabled = false)
    public void testDivForDouble1() {
        Assert.assertEquals(calculator.div(3.3, 2.75), 1.2, " Сalculator made a mistake");
    }

    @Test(description = "Some description in terminal")
    public void testDivforInt2() {
        Assert.assertEquals(calculator.div(4, 2), 2, " Сalculator made a mistake");
        System.out.println("Test is okay");
    }

    @Test(description = "Some description in terminal")
    public void testDivforDouble2() {
        Assert.assertEquals(calculator.div(3.3, 2.75), 1.2, " Сalculator made a mistake");
        System.out.println("Test is okay");
    }

    @Test(testName = "Test with name")
    public void testDivforInt3() {
        Assert.assertEquals(calculator.div(4, 2), 2, " Сalculator made a mistake");
        System.out.println("Test is okay");
    }

    @Test(testName = "Some name ")
    public void testDivforDouble3() {
        Assert.assertEquals(calculator.div(3.3, 2.75), 1.2, " Сalculator made a mistake");
        System.out.println("Test is okay");
    }

    @Test(timeOut = 700)
    public void testDivforInt4() {
        Assert.assertEquals(calculator.div(2, 2), 1);
    }

    @Test(timeOut = 700)
    public void testDivforInt4Fail() throws InterruptedException {
        Assert.assertEquals(calculator.div(2, 2), 1);
        Thread.sleep(1000);
    }

    @Test(timeOut = 700)
    public void testDivforDouble4() {
        Assert.assertEquals(calculator.div(3.3, 2.75), 1.2);
    }

    @Test(timeOut = 700)
    public void testDivforDouble4Fail() throws InterruptedException {
        Assert.assertEquals(calculator.div(2, 2), 1);
        Thread.sleep(1000);
    }

    @Test(invocationCount = 3)
    public void testDivforint5() {
        Assert.assertEquals(calculator.div(2, 2), 1);
    }

    @Test(invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3)
    public void testDivforint6() {
        Assert.assertEquals(calculator.div(2, 2), 1);
    }

    @Test(invocationCount = 3)
    public void testDivforDouble5() {
        Assert.assertEquals(calculator.div(3.3, 2.75), 1.2);
    }

    @Test(invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3)
    public void testDivforDouble6() {
        Assert.assertEquals(calculator.div(3.3, 2.75), 1.2);
    }

    @Test(dataProvider = "dataForint", dataProviderClass = StaticProvider.class)
    public void testDataProvaiderForInt(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.div(a, b), expectedResult, "Some mistake");
    }

    @Test(dataProvider = "dataForint1", dataProviderClass = StaticProvider.class, expectedExceptions = ArithmeticException.class)
    public void testDataProvaiderForInt1(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.div(a, b), expectedResult, "Some mistake");

    }

    @Test(dataProvider = "dataForDouble", dataProviderClass = StaticProvider.class)
    public void testDataProvaiderForDouble(double a, double b, double expectedResult) {
        Assert.assertEquals(calculator.div(a, b), expectedResult);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void TestDiv() throws ArithmeticException {
        calculator.div(10, 0);
    }

    @Test
    public void testDivisionDoubleByZero() {
        Assert.assertEquals(calculator.div(12.5, 0), Double.POSITIVE_INFINITY, "Результат деления дробных чисел на '0' неверен");


    }
}
