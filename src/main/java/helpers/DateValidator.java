package helpers;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {

    public static List<String> monthRus = Arrays.asList("января", "февраля", "марта", "апреля", "мая", "июня",
                "июля", "августа", "сентября", "октября", "ноября", "декабря");

    public static int getMonths(String rus) {
        System.out.println("rus = [" + rus + "]");
        return monthRus.indexOf(rus) + 1;
    }

    public static void dateChecker(String value){
        Pattern pattern = Pattern.compile("Курс на (\\d+) ([а-я]+) (\\d+) года");
        Matcher matcher = pattern.matcher(value);
        if(matcher.find()) {
            SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy");
            java.util.Date date = null;
            try {
                String toParse = String.format("%s-%s-%s", matcher.group(1), getMonths(matcher.group(2)), matcher.group(3));
                System.out.println(toParse);
                date = format.parse(toParse);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(date);
        } else {
            System.out.println("Hello World!");
        }
    }
}

