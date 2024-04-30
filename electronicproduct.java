package ecommercesystem;
/**
 *
 * @author Mohamed Yahia
 */
public class electronicproduct extends Product {
private String brand ;
private int warrantyPeriod ;

    public electronicproduct(String brand, int warrantyPeriod, int productid, String name, double price) {
        super(productid, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
    public String getBrand() {
        return brand;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
        
}
