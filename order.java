package ecommercesystem;

public class order extends cart{
    private int customerid;
    private int orderid;
order (int id){
    this.customerid = id;
    orderid ++ ;
}
order (){
    orderid ++ ;
}
    public void printOrderInfo(double calculatePrice , Product [] product_arr , int nproducts) {
        System.out.println(" Here is Your Order Summary :");
        System.out.println("Order ID : "+orderid);
        System.out.println("Products :");
        for(int i = 0 ; i< nproducts ; i++){
            if(product_arr[i]!=null){
                System.out.println(product_arr[i].getName() + " - " +product_arr[i].getPrice()+"$" );
            }
            else{
                    System.out.println("Warning ! Product at index " + i + " is null ! \n Skipping...");
            }
        }
        System.out.println("Total Price : "+calculatePrice+"$");
    }
    public String printOrderInfoGUI(double calculatePrice , Product [] product_arr , int nproducts , int Customerid) {
        String x1 = " Here is Your Order Summary :";
        String x2 =("Order ID : "+orderid);
        String x3 =("Products :-");
        String[] arr = new String[nproducts];
        for(int i = 0 ; i< nproducts ; i++){
            if(product_arr[i]!=null)
            arr[i] = String.valueOf(product_arr[i].getName() + " - " + product_arr[i].getPrice() + "$");
        }
        for (int i = 0 ; i<nproducts ; i++) {
            if (arr[i] != null)
                x3 += "\n" + arr[i];
        }
        String x4 =("Total Price : "+calculatePrice+"$");
        String x5 =("Customer ID : "+Customerid);
        String full_x = x1  + "\n" + x5 +"\n"+ x2 + "\n" + x3 +"\n" + x4 +"\n";
        return full_x;
    }
    public void bye (){
        System.out.println("Thank You for visiting us ");
                System.out.println("Exiting...");
    }
    public String byeGUI (){
        String x1 = ("Thank You for visiting us ");
        String x2 = ("Exiting...");
        String full_x = x1 + "\n" + x2;
        return full_x;
    }
    public String placeorderGUI(double totalprice){
        String x1 = "Your Total is : ";
        String x2 = (totalprice + " $ would you like to place order ?");
        String full_x = x1 + "\n" + x2;
        return full_x;    }
       
    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = Math.abs(customerid); 
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = Math.abs(orderid); 
    }

    }