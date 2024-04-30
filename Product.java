package ecommercesystem;
/**
 *
 * @author Mohamed Yahia
 */
public class Product {
public static final String Price = null;
protected int productid ;
protected String name ;
protected double price ;

    Product (){
    this.name = null ;
    this.productid = 0;
    this.price =  0.0 ;
}

    Product (int productid , String name , double price ){
    this.name = name ;
    this.productid = Math.abs(productid);
    this.price = Math.abs(price);
}

    public void setProductid(int productid) {
        this.productid = Math.abs(productid);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = Math.abs(price);
    }

    public int getProductid() {
        return productid;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}