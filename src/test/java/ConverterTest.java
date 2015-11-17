import helpers.DriverSingleton;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static helpers.DriverSingleton.getDriver;

public class ConverterTest {

    public static final String BASE_URL = "http://www.tut.by/";

    @BeforeMethod(alwaysRun = true)
    public void setup(){

        getDriver().get(BASE_URL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        DriverSingleton.quit();
    }
}
