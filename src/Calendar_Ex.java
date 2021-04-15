
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
class Date {
    public static String findDay(int month, int day, int year) {
        Calendar c=Calendar.getInstance();
        c.set(year, month, day);
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}

public class Calendar_Ex {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the month : ");
        int month = scan.nextInt();
        System.out.println("Enter the Day : ");
        int day = scan.nextInt();
        System.out.println("Enter the Year : ");
        int year = scan.nextInt();
        String res = Date.findDay(month, day, year);
        System.out.println(res);
    }
}
