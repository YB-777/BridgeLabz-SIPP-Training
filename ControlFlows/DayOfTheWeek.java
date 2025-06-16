import java.util.Scanner;

// Compute the day of the week that the date falls on
public class DayOfTheWeek {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        // Gregorian calendar formula
        int year_0 = year - (14 - month) / 12;
        int x = year_0 + year_0 / 4 - year_0 / 100 + year_0 / 400;
        int month_0 = month + 12 * ((14 - month) / 12) - 2;
        int day_0 = (day + x + (31 * month_0) / 12) % 7;

        // Printing the day of the week starting from Sunday = 0
        System.out.println("Day of the Week : " + day_0);
        
        sc.close();
    }
}
