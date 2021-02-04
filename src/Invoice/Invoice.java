package Invoice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int QuantityPurchased;
    private double pricePerItem;
    private boolean QuantityItemBeingPurchased;

    Invoice(String partNumber,String partDescription,int quantityPurchased,double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
//        QuantityPurchased = QuantityItemBeingPurchased;
        this.pricePerItem = pricePerItem;
    }

    public void setpartNumber(String partNumber) {
        this.partNumber = partNumber;
    }


    public String getpartNumber() {
        return partNumber;
    }

    public void setpartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getpartDescription() {
        return partDescription;
    }

    public void setQuantityItemBeingPurchased(int QuantityPurchased) {
        if( QuantityItemBeingPurchased)
        this.QuantityPurchased = QuantityPurchased;
    }

    public int getQuantityItemBeingPurchased() {
        return QuantityPurchased;
    }

    public void setpricePerItem(double pricePerItem) {

        if (pricePerItem >0.0)
            pricePerItem = pricePerItem;

        if (pricePerItem <= 0.0)
            pricePerItem = 0.0;
    }

    public double getpricePerItem() {

        return pricePerItem;
    }
}
