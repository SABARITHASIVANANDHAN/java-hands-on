package section3;

import java.util.Scanner;

public class RedCrossWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tent = sc.nextInt();
        int refugees[] = new int[tent];
        int i = 0, sum = 0;
        while (i < tent) {
            refugees[i] = sc.nextInt();
            sum = sum + refugees[i];
            i++;
        }
        System.out.println(sum);
        sc.close();
    }

}
