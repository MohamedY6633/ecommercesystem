package ecommercesystem;
/**
 *
 * @author Mohamed Yahia
 */
public class Customer extends Product {
    protected int customerid ;
    protected String name , address ;
   
    public void setCustomerid(int customerid) {
        this.customerid = Math.abs(customerid);
    }
    
 public int getCustomerid() {
        return customerid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    } 
}
