package section4;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.println("Enter the product ID");
        Long id = sc.nextLong();
        p.setId(id);
        sc.nextLine();
        System.out.println("Enter the product name");
        String productName = sc.nextLine();
        p.setProductName(productName);
        System.out.println("Enter the suppliers name");
        String supplierName = sc.nextLine();
        p.setSuppliername(supplierName);
        System.out.println("Product ID is:" + p.getId());
        System.out.println("Product name is:" + p.getProductName());
        System.out.println("Suppliers name is:" + p.getSuppliername());
        sc.close();

    }

}
