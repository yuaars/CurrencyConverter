package pages;


import org.openqa.selenium.By;
import static helpers.Locators.get;

public class FinancePage {


    public static final By FINANCE_PAGE_TAB = get("financeLink");
    public static final By CURRENCY_CONVERTER_BLOCK = get("currencyConverterBlock");
    public static final By CURRENCY_DDL_FIELD_NAME_BYR = get("currencyDDLFieldNameBYR");
    public static final By CURRENCY_DDL_FIELD_NAME_USD = get("currencyDDLFieldNameUSD");
    public static final By SELECT_FIELD_BYR = get("selectFieldBYR");
    public static final By SELECT_FIELD_USD = get("selectFieldUSD");
    public static final By ADD_CURRENCY_FIELD = get("addCurrencyField");
    public static final By CURRENT_NBRB_COURSE = get("currentCourse");



}
