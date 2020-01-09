package section3;

import java.util.Scanner;

public class RedCross {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tent = sc.nextInt();
        int refugees[] = new int[tent];
        int sum = 0;
        for (int i = 0; i < tent; i++) {
            refugees[i] = sc.nextInt();
            sum = sum + refugees[i];
        }
        System.out.println(sum);

        sc.close();

    }
}
