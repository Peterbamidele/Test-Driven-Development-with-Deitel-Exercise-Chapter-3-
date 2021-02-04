package Invoice;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("No:tr3567","Tv",2,15000.00);

        System.out.println("Your Invoice Details Are:");
        System.out.println("Serial No: " + invoice.getpartNumber());
        System.out.println("Product Details: " + invoice.getpartDescription());
        System.out.println("Product Quantity: " + invoice.getQuantityItemBeingPurchased());
        System.out.println("Amount Paid: " + invoice.getpricePerItem());
    }
}
