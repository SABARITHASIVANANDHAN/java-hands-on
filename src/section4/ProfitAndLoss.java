package section4;

import java.util.Scanner;

public class ProfitAndLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased");
        int dozenPurchased = sc.nextInt();
        System.out.println("Enter the price per dozen  ");
        int costPerDozen = sc.nextInt();
        System.out.println("Enter the selling price of 1 toy ");
        int sellingPrice = sc.nextInt();
        ProfitAndLoss pl = new ProfitAndLoss();
        float profitLose = pl.calculateProfit(dozenPurchased, costPerDozen, sellingPrice);
        System.out.printf("Sam's profit percentage is %.2f percent", profitLose);
        sc.close();
    }

    public float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice) {

        float costPrice = (float) pricePerDozen / 12;
        float profit = (float) sellPrice - costPrice;
        float profitPercent = (profit / costPrice) * 100;
        return profitPercent;

    }

}
