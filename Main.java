package ecommercesystem;
/**
 *
 * @author Mohamed Yahia
 */
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
    GUI d = new GUI();
    System.out.println("Welcome to the E-commerce system");
    int customerid = setcustomerdata();
    cart c = setcart();
    setorder(customerid, c);
    }
    public static int setcustomerdata (){
    Customer c = new Customer();
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter Your ID");
    c.setCustomerid(s.nextInt());
    System.out.println("Enter Your Name");
    c.setName(s1.nextLine());
    System.out.println("Enter Your address");
    c.setAddress(s1.nextLine());
    return c.getCustomerid();
    }
    public static cart setcart (){
        electronicproduct ep1 = new electronicproduct ("Samsung" , 1 , 1 , "smartphone" , 599.9);
        clothingproduct cp1  = new clothingproduct (2 , "T-shirt" , "Meduim" , "cotton" ,  19.99);
        bookproduct bp1 = new bookproduct ("OReilly" , "X Publications" , 3 , "OOP" ,  39.99);
        cart c = new cart();
        Scanner s = new Scanner(System.in);
        
        System.out.println("How many products you want to add to your cart ?");
        c.setnProducts(s.nextInt());
        for(int i = 0 ; i < c.getnproducts() ; i++){
        System.out.println("Which product would you like to add? 1- Smartphone 2- T—Shirt 3- OOP");
        int choose = s.nextInt();
        if (choose<4) {
           switch (choose) {
            case 1:
             c.addproduct(ep1);
                break;
            case 2:  
            c.addproduct(cp1);  
                break;
            case 3:
            c.addproduct(bp1); 
                break;
            } 
        }
        else {
            System.out.println("index out of range");
        }
        }
        return c ;
    }    
        public static void setorder(int customerid , cart c) {
        Scanner s = new Scanner(System.in);
        order o = new order(customerid);
        c.deleteproduct(0);
        while (true){
        System.out.println("Your total is :"+c.calculatePrice()+"$ Would you like to place order 1- Yes , 2- No");
        int flag = s.nextInt();
        if(flag >2 || flag <1 ){
            System.out.println("index out of range");
        }
        else{
            switch (flag) {
                case 1:
                    o.printOrderInfo(c.calculatePrice() , c.product_arr ,c.nproducts);
                    break;
                case 2:
                    o.bye();
                    break;
            }
            break;
        }
    }
}
}