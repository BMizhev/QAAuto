package HW6;

public class Main {
    public static void main(String[] args) {
       Product product1 = new Product("Coca-Cola", 123456, 2.5, true);
       Product product2 = new Product("Pepsi", 456789, 3, false);

       Invoice colaInvoice = new Invoice();
       colaInvoice.invoiceNumber = 1111;
       product1.purchase(colaInvoice);
    }
}
