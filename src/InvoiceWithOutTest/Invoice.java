package InvoiceWithOutTest;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int QuantityItemBeingPurchased;
    private double pricePerItem;

    Invoice (String partNumber, String partDescription, int quantityItemBeingPurchased, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        QuantityItemBeingPurchased = quantityItemBeingPurchased;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityItemBeingPurchased() {
        return QuantityItemBeingPurchased;
    }

    public void setQuantityItemBeingPurchased(int quantityItemBeingPurchased) {
        if (QuantityItemBeingPurchased == 0.0)
            QuantityItemBeingPurchased = 0;
        QuantityItemBeingPurchased = quantityItemBeingPurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem == 0)
            pricePerItem = 0;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount(){


     return getQuantityItemBeingPurchased() * getPricePerItem();
    }


}

