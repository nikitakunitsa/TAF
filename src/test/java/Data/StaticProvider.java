package Data;

import org.testng.annotations.DataProvider;

public class StaticProvider {

    @DataProvider(name = "dataForint1")
    public static Object[][] dataForint1() {
        return new Object[][]{
                {-0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "dataForint")
    public static Object[][] dataForint() {
        return new Object[][]{
                {4, 2, 2},
                {6, 3, 2},
                {10, 5, 2},
                {1, 0, 0}
        };

    }
    @DataProvider(name = "dataForDouble")
    public static Object[][] dataForDouble() {
        return new Object[][]{
                {3.3, 2.75, 1.2},
                {3.3, 1.2,2.75 },
                {2.8, 1.6, 1.75},
                {2.8, 1.75, 1.6}

        };
    }
}
