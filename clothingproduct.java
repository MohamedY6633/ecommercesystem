package ecommercesystem;
/**
 *
 * @author Mohamed Yahia
 */
public class clothingproduct extends Product {
    String size , fabric ;

    public clothingproduct(int productid, String name, String size , String fabric , double price) {
        super(productid, name, price);
        this.size = size;
        this.fabric = fabric ; 
    }

    public clothingproduct() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    
}
