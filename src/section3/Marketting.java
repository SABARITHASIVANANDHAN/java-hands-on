package section3;

import java.util.Scanner;

public class Marketting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String s1 = s.nextLine();
        System.out.println("Enter the old name of the company");
        String os = s.nextLine();
        System.out.println("Enter the new name of the company");
        String ns = s.nextLine();
        System.out.println("The content of the modified document is");
        System.out.println(s1.replace(os, ns));
        s.close();
    }

}
