package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static helpers.DriverSingleton.getDriver;
import static helpers.Locators.get;

public class FinancePage {


    public static final By FINANCE_PAGE_TAB = get ("financeLink");
    public static final By CURRENCY_CONVERTER_BLOCK = get ("currencyConverterBlock");

   /* private  void financeTabClick(){
        WebElement financeTab = getDriver().findElement(FinancePage.FINANCE_PAGE_TAB);
        financeTab.click();
    }*/

    public static void presenceOfElement(){
        WebElement financeTab = getDriver().findElement(FINANCE_PAGE_TAB);
        Assert.assertTrue(financeTab.isDisplayed());
    }

    public static void currentURL () {
        WebElement financeTab = getDriver().findElement(FINANCE_PAGE_TAB);
        Assert.assertTrue(financeTab.isDisplayed());
        financeTab.click();
        String currentURL = getDriver().getCurrentUrl();
        String expectedURL = "http://finance.tut.by/";
        Assert.assertEquals(currentURL,expectedURL);
    }

    public static void presenceOfCurrencyConverterBlock(){
        WebElement financeTab = getDriver().findElement(FINANCE_PAGE_TAB);
        financeTab.click();

        WebElement currencyConverterBlock = getDriver().findElement(CURRENCY_CONVERTER_BLOCK);
        Assert.assertTrue(currencyConverterBlock.isDisplayed());
    }
}
