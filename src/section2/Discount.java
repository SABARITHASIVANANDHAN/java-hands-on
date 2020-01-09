package section2;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Price of item1 : ");
        float item1 = sc.nextFloat();
        System.out.println("Price of item2 : ");
        float item2 = sc.nextFloat();
        System.out.println("Discount in percentage : ");
        int discount = sc.nextInt();

        float total = item1 + item2;
        float dis = (total * discount) / 100;
        float discountAmount = total - dis;
        float savedAmount = total - discountAmount;
        System.out.printf("Total Amount : $%.2f\n", total);
        System.out.printf("Discountd Amount : $%.2f\n", discountAmount);
        System.out.printf("Saved Amount : $%.2f\n", savedAmount);
        sc.close();

    }

}
