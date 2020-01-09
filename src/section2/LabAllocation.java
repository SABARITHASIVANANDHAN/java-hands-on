package section2;

import java.util.Scanner;

public class LabAllocation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();
        System.out.println("Enter z");
        int z = sc.nextInt();
        if (x < y && x < z) {
            System.out.println("L1 is minimal seating capacity");
        } else if (y < x && y < z) {
            System.out.println("L2 is minimal seating capacity");
        } else {
            System.out.println("L3 is minimal seating capacity");
        }
        sc.close();
    }

}
