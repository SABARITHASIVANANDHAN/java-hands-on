package section3;

import java.util.Scanner;

public class RedCrossForEach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tent = sc.nextInt();
        int refugees[] = new int[tent];
        int sum = 0;
        for (int i = 0; i < tent; i++) {
            refugees[i] = sc.nextInt();
        }
        for (int i : refugees) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }

}