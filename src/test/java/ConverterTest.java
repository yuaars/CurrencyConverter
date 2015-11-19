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
    public void presenceOfFinanceTabTest(){

        WebElement financeTab = getDriver().findElement(FinancePage.FINANCE_PAGE_TAB);
        Assert.assertTrue(financeTab.isDisplayed());
    }

    @Test
    public void correctnessOfURLTest(){

        WebElement financeTab = getDriver().findElement(FinancePage.FINANCE_PAGE_TAB);
        Assert.assertTrue(financeTab.isDisplayed());
        financeTab.click();
        String currentURL = getDriver().getCurrentUrl();
        String expectedURL = "http://finance.tut.by/";
        Assert.assertEquals(currentURL, expectedURL);
    }

    @Test
    public void presenceOfConverterBlockTest(){

        WebElement financeTab = getDriver().findElement(FinancePage.FINANCE_PAGE_TAB);
        financeTab.click();

        WebElement currencyConverterBlock = getDriver().findElement(FinancePage.CURRENCY_CONVERTER_BLOCK);
        Assert.assertTrue(currencyConverterBlock.isDisplayed());
    }

    @Test
    public void presenceOfFieldsOfCurrencyConverterBlockTest(){

        WebElement financeTab = getDriver().findElement(FinancePage.FINANCE_PAGE_TAB);
        financeTab.click();

        WebElement currencyFieldNameBYR = getDriver().findElement(FinancePage.CURRENCY_DDL_FIELD_NAME_BYR);
        WebElement currencyFieldNameUSD = getDriver().findElement(FinancePage.CURRENCY_DDL_FIELD_NAME_USD);
        WebElement selectFieldBYR = getDriver().findElement(FinancePage.SELECT_FIELD_BYR);
        WebElement selectFieldUSD = getDriver().findElement(FinancePage.SELECT_FIELD_USD);
        WebElement addCurrencyField = getDriver().findElement(FinancePage.ADD_CURRENCY_FIELD);

        Assert.assertTrue(currencyFieldNameBYR.isDisplayed());
        Assert.assertTrue(currencyFieldNameUSD.isDisplayed());
        Assert.assertTrue(selectFieldBYR.isDisplayed());
        Assert.assertTrue(selectFieldUSD.isDisplayed());
        Assert.assertTrue(addCurrencyField.isDisplayed());
    }

    @Test
    //?! doesn't work yet
    public void currentCourseTest() throws InterruptedException {
        WebElement financeTab = getDriver().findElement(FinancePage.FINANCE_PAGE_TAB);
        financeTab.click();

        WebElement selectFieldBYR = getDriver().findElement(FinancePage.SELECT_FIELD_BYR);
        WebElement selectFieldUSD = getDriver().findElement(FinancePage.SELECT_FIELD_USD);
        WebElement currentCourse = getDriver().findElement(FinancePage.CURRENT_NBRB_COURSE);

        selectFieldUSD.sendKeys("1");
        Thread.sleep(2000);

        Assert.assertEquals(selectFieldBYR.getText(),currentCourse.getText());

        System.out.println(selectFieldBYR.getText());

    }
}

