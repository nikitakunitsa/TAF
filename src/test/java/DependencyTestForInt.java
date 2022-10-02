import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestForInt extends BaseTest {
    @Test
    public void stepb() {
        Assert.assertEquals(calculator.div(2, 1), 3);
    }

    @Test(dependsOnMethods = "stepb", alwaysRun = true)
    public void stepa() {
    }

    @Test(dependsOnMethods = "stepb")
    public void stepd() {

    }

}
