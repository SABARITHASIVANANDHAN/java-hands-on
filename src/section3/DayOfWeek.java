package section3;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        String days[] = new String[7];
        days[0] = "Sun";
        days[1] = "Mon";
        days[2] = "Tue";
        days[3] = "Wed";
        days[4] = "Thur";
        days[5] = "Fri";
        days[6] = "Sat";
        System.out.println("Enter the day number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Day of the week is " + days[number - 1]);
        sc.close();

    }

}
