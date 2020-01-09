package section4;

public class Product1 {

    private Long id;
    private String productName;
    private String supplierName;

    public Product1() {
    }

    public Product1(Long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    void display() {
        System.out.println("Product ID is:" + getId());
        System.out.println("Product name is:" + getProductName());
        System.out.println("Suppliers name is:" + getSupplierName());

    }

}
