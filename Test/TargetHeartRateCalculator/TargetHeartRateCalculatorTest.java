package TargetHeartRateCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateCalculatorTest {

    TargetHeartRateCalculator targetHeartRateCalculator;

    @BeforeEach
    void setUp() {
        targetHeartRateCalculator = new TargetHeartRateCalculator();
    }

    @AfterEach
    void tearDown() {
        targetHeartRateCalculator = null;
    }

    @Test
    void CheckTargetHeartRateCalculatorHasFirstName() {
        targetHeartRateCalculator.setfirstName("Peter");
        assertEquals("Peter", targetHeartRateCalculator.getfirstName());
    }

    @Test
    void CheckTargetHeartRateCalculatorHasLastName() {
        targetHeartRateCalculator.setlastName("Peter");
        assertEquals("Peter", targetHeartRateCalculator.getlastName());
    }


    @Test
    void CheckTargetHeartRateCalculatorHasDateOfBirth() {
        targetHeartRateCalculator.setdateOfBirth(20/10/2021);
        assertEquals(20/10/2021, targetHeartRateCalculator.getfirstName());
    }

    @Test
    void CheckTargetHeartRateCalculatorHasHeight(){
        targetHeartRateCalculator.setheight(73.5);
        assertEquals(73.5,targetHeartRateCalculator.getheight());
    }

//    @Test
//    void CheckTargetHeartRateCalculatorHasHeight(){
//        targetHeartRateCalculator.setheight(73.5);
//        assertEquals(73.5,targetHeartRateCalculator.getheight());
//    }
}