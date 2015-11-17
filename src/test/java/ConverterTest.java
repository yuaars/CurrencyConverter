import helpers.DriverSingleton;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FinancePage;

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

    @Test
    public void presenceOfFinanceTab(){
        
        WebElement financeTab = getDriver().findElement(FinancePage.FINANCE_PAGE_TAB);
        Assert.assertTrue(financeTab.isDisplayed());
    }
}
