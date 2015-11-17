package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static helpers.DriverSingleton.getDriver;
import static helpers.Locators.get;

public class FinancePage {


    public static final By FINANCE_PAGE_TAB = get ("financeLink");

    public static void presenceOfElement(){
        WebElement financeTab = getDriver().findElement(FinancePage.FINANCE_PAGE_TAB);
        Assert.assertTrue(financeTab.isDisplayed());
    }

    public static void currentURL () {
        WebElement financeTab = getDriver().findElement(FinancePage.FINANCE_PAGE_TAB);
        Assert.assertTrue(financeTab.isDisplayed());
        financeTab.click();
        String currentURL = getDriver().getCurrentUrl();
        Assert.assertEquals(currentURL,"http://finance.tut.by/");
    }
}
