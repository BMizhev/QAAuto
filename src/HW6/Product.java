package HW6;

public class Product {
    String name;
    int code;
    double price;
    boolean available;

    public Product(String itemName, int barCode, double unitPrice, boolean isAvailable){
        name = itemName;
        code = barCode;
        price = unitPrice;
        available = isAvailable;

    }

     public void purchase(Invoice invoice){
         System.out.println("item " + name + " got the invoice " + invoice.invoiceNumber);

     }
}
