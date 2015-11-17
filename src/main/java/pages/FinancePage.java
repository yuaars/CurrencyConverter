package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static helpers.DriverSingleton.getDriver;
import static helpers.Locators.get;

public class FinancePage {


    public static final By FINANCE_PAGE_TAB = get ("financeLink");
    public static final By CURRENCY_CONVERTER_BLOCK = get ("currencyConverterBlock");
    public static final By CURRENCY_FIELD_NAME_BYR = get("currencyFieldNameBYR");
    public static final By CURRENCY_FIELD_NAME_USD = get("currencyFieldNameUSD");
    public static final By SELECT_FIELD_BYR = get("selectFieldBYR");
    public static final By SELECT_FIELD_USD = get("selectFieldUSD");
    public static final By ADD_CURRENCY_FIELD= get("addCurrencyField");
    //public static final By INPUT_FIELD_OF_FIRST_CURRENCY = get();
    //public static final By INPUT_FIELD_OF_SECOND_CURRENCY = get();


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

    public static void presenceOfFieldsOfCurrencyConverterBlock(){
        WebElement financeTab = getDriver().findElement(FINANCE_PAGE_TAB);
        financeTab.click();

        WebElement currencyFieldNameBYR = getDriver().findElement(CURRENCY_FIELD_NAME_BYR);
        WebElement currencyFieldNameUSD = getDriver().findElement(CURRENCY_FIELD_NAME_USD);
        WebElement selectFieldBYR = getDriver().findElement(SELECT_FIELD_BYR);
        WebElement selectFieldUSD = getDriver().findElement(SELECT_FIELD_USD);
        WebElement addCurrencyField = getDriver().findElement(ADD_CURRENCY_FIELD);

        Assert.assertTrue(currencyFieldNameBYR.isDisplayed());
        Assert.assertTrue(currencyFieldNameUSD.isDisplayed());
        Assert.assertTrue(selectFieldBYR.isDisplayed());
        Assert.assertTrue(selectFieldUSD.isDisplayed());
        Assert.assertTrue(addCurrencyField.isDisplayed());
    }
}
