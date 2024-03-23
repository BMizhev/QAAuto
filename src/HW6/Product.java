package HW6;

public class Product {
   private String name;
    private int code;
    double price;
    boolean available;

    public Product(String itemName, int barCode, double unitPrice, boolean isAvailable) {
        name = itemName;
        code = barCode;
        price = unitPrice;
        available = isAvailable;
    }

    //getter
    public String getName() {
            return name;
        }
    public int getCode(){
        return code;
    }
    public double getPrice(){
        return price;
    }
    public boolean isAvailable(){
        return available;
    }
    //setter:
    public void setPrice(double retail){
        price = retail;
    }
    public void setName(String newName){
        name = newName;
    }


}
