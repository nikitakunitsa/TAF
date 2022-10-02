import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestForDouble extends BaseTest {
    @Test()
    public void stepb() {
       Assert.assertEquals(calculator.div(4.15,6.17),5.64);
    }

    @Test(dependsOnMethods = "stepb", alwaysRun = true)
    public void stepa() {
    }

    @Test(dependsOnMethods = "stepb")
    public void stepd() {

    }

}


