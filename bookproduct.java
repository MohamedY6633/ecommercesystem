package ecommercesystem;
/**
 *
 * @author Mohamed Yahia
 */
public class bookproduct extends Product {
    String author , publisher ;
    public bookproduct(String author, String publisher, int productid, String name, double price) {
        super(productid, name, price);
        this.author = author;
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
