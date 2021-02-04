package Invoice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice invoice;

    @BeforeEach
    void setUp() {
       invoice = new Invoice("No:Tse1254","Fridge",1,2500.00);
    }

    @AfterEach
    void tearDown() {
         invoice = null;
    }
    @Test
    void TestIfInvoiceHasAPartNumber(){
        invoice.setpartNumber("partNumber");
        assertEquals("partNumber",invoice.getpartNumber());
    }

    @Test
    void TestIfInvoiceHasAPartDescription(){
        invoice.setpartDescription("partDescription");
        assertEquals("partDescription",invoice.getpartDescription());
    }
    @Test
    void TestIfInvoiceHasAQuantityOfTheItemBeingPurchased(){
        invoice.setQuantityItemBeingPurchased(1200);
        assertEquals(1200,invoice.getQuantityItemBeingPurchased());;
    }

    @Test
    void TestIfInvoiceHasAPricePerItem(){
        invoice.setpricePerItem(2.00);
        assertEquals(2.00,invoice.getpricePerItem());
    }




}