package helpers;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY:MM:HH:mm:ss");
        System.out.println("Current time is -  Year:Month:Hour:Minute:Seconds: " + sdf.format(cal.getTime()) );
    }

}