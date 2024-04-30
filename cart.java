package ecommercesystem;    
/**
 *
 * @author Mohamed Yahia
 */
public class cart extends Customer {
    protected int customerid = 0 ;
    protected int nproducts;
    protected Product[] product_arr;
    private int curr = 0;
    public cart() {
        this.nproducts = 0;
    }

    public int getnproducts() {
        return nproducts;
    }

    public void setnProducts(int nProducts) {
        if (nProducts < 0 || nProducts == 0) {
            System.out.println("index out of range");
        } else {
            this.nproducts = Math.abs(nProducts);
            this.product_arr = new Product[this.nproducts];
        }
    }

    public void setProducts(Product[] products) {
        this.product_arr = products; 
    }

    public void getProducts() {
        for (int i = 0 ; i < nproducts ; i++){
            if(product_arr != null){
        System.out.println(product_arr [i].getName() +"-"+product_arr [i].getPrice()+"$");  
    }else{
        System.out.println("Warning ! Product at index " + i + " is null ! \n Skipping...");
    }
        }
}
    public boolean addproduct(Product product) {
        boolean b = true;
        if (curr < nproducts) {
            product_arr[curr] = product;
            curr++;
        } else {b = false ;
            System.out.println("Cart is full.");
        }return b;
    }
    public void deleteproduct(int index) {
        if (index < 0 || index >= nproducts) { 
            System.out.println("index out of range");
        } else {
            product_arr[index] = null;
        }
    }
    public double calculatePrice() {
        double totalPrice = 0;
        for (int i = 0; i < nproducts; i++) {
            if (product_arr[i] != null) {
                totalPrice += product_arr[i].getPrice();
            } else {
                System.out.println("Warning ! Product at index " + i + " is null ! \n Skipping...");
            }
        }
        return totalPrice;
    }
    public double placeOrder() {
        double totalPrice = 0;
        return totalPrice = calculatePrice(); 
    }
}
