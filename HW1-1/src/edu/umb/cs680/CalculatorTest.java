package edu.umb.cs680;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void multiply3By4() {
        Calculator cut = new Calculator();
        float expected = 6;
        float actual = cut.multiply(2,3);
        assertTrue(cut instanceof Calculator);
        assertEquals(expected, actual);
    }
    @Test
    public void divide3By2(){
        Calculator cut = new Calculator();
        float expected = 1.5;
        float actual = cut.divide(3,2);
        assertEquals(expected, actual);
    }
    @Test
    public void divide5By0withTryCatch(){
        Calculator cut = new Calculator();
        try{
            cut.divide(4, 0);
            fail("Division by zero");
        }
        catch(IllegalArgumentException ex){
            assertEquals("division by zero", ex.getMessage());
        }
    }
} 
