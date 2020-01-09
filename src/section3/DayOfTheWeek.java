package section3;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        String days[] = { "Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat" };
        System.out.println("Enter the day number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Day of the week is " + days[number - 1]);
        sc.close();

    }

}
