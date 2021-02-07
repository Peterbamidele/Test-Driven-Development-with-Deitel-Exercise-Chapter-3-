package InvoiceWithOutTest;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);



       Invoice invoice = new Invoice("290200","tv",3,6757);
       Invoice invoice1 = new Invoice("rtsed9899","laptop",7,85000);

        System.out.printf("PartNumber: %s%n",invoice.getPartNumber());
        System.out.printf("PartDescription: %s%n ",invoice.getPartDescription());
        System.out.printf("QuantityItemBeingPurchased : %d%n ",invoice.getQuantityItemBeingPurchased());
        System.out.printf("PricePerItem : %f%n",invoice.getPricePerItem());
        System.out.printf("TOTAL :%f%n", invoice.getInvoiceAmount());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Item SerialNumber:");
        invoice.setPartNumber(input.nextLine());

        System.out.print("Enter Item Bought:");
        invoice.setPartDescription(input.nextLine());

        System.out.print("Enter Item Quantity:");
        invoice.setQuantityItemBeingPurchased(input.nextInt());

        System.out.print("Enter Price of Item: ");
        invoice.setPricePerItem(input.nextInt());

        System.out.println("PART/SERIAL NUMBER: " + invoice.getPartNumber() + "\n" + "ITEM DESCRIPTION: " + invoice.getPartDescription() + "\n" +
                "QUANTITY Of ITEM:" + invoice.getQuantityItemBeingPurchased()  + "\n" + "ITEM PER PRICE :" + invoice.getPricePerItem() + "\n"+"\t" + "TOTAL:" + invoice.getInvoiceAmount() );





    }


    }
