import java.util.Date;

public class CurrentDateTime{
    public static void main(String[] args) {
        long totMilSec = System.currentTimeMillis();

        long totSec = totMilSec / 1000;
        long CurSec = totSec % 60;

        long totMin = totSec / 60;
        long curMin = totMin % 60;

        long totHour = totMin / 60;
        long curHour = totHour % 24;

        System.out.println("The current Time is " + (curHour+6) + " : " + curMin + " : "+ CurSec + " (DHAKA)");

        Date date = new Date();
        System.out.println(date);
    }    
}