package section3;

import java.util.Scanner;

public class SecureUrl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string\n");
        String url = sc.next();
        System.out.println("Enter the start string\n");
        String startString = sc.next();
        if (startString.equals("https")) {
            System.out.println("\"" + url + "\" starts with https\"");
        } else {
            System.out.println("\"" + url + "\" does not starts with https\"");
        }
        sc.close();

    }

}
