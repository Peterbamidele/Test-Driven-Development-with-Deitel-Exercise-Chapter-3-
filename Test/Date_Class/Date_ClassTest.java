package Date_Class;

import Date_Class.Date_Class;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date_ClassTest {
    Date_Class date_class;
    @BeforeEach
    void setUp() {
        date_class = new Date_Class(12,31,2021);
    }

    @AfterEach
    void tearDown() {
        date_class = null;
    }

    @Test
    void CheckIfDateHasContainAMonthy(){
        date_class.setMonth(12);
       date_class.scanner.nextInt();
        assertEquals(12,date_class.getmonth());
    }

    @Test
    void CheckIfDateContainADay(){
        date_class.setDay(30);
        date_class.scanner.nextInt();
        assertEquals(30,date_class.getday());
    }

    @Test
    void CheckIfYearContainAYear(){
        date_class.setYear(1992);
        date_class.scanner.nextInt();
        assertEquals(1992,date_class.getyear());
    }



}