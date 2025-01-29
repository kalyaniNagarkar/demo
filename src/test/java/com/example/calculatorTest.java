package com.example;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class calculatorTest {
    private static final double DELTA = 1e-15;  // Delta for double comparison
    private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main();
    }

    @Test
    public void testAddition() {
        // Test positive numbers
        assertEquals(11.0, calculator.addition(4.0, 7.0), DELTA);
        assertEquals(15.5, calculator.addition(7.5, 8.0), DELTA);
        
        // Test negative numbers
        assertEquals(-3.0, calculator.addition(-1.0, -2.0), DELTA);
        assertEquals(-5.5, calculator.addition(-7.5, 2.0), DELTA);
        
        // Test with zero
        assertEquals(5.0, calculator.addition(5.0, 0.0), DELTA);
        assertEquals(0.0, calculator.addition(0.0, 0.0), DELTA);
    }

    @Test
    public void testSubtraction() {
        // Test positive numbers
        assertEquals(23.0, calculator.subtraction(30.0, 7.0), DELTA);
        assertEquals(10.5, calculator.subtraction(15.5, 5.0), DELTA);
        
        // Test negative numbers
        assertEquals(-5.0, calculator.subtraction(-2.0, 3.0), DELTA);
        assertEquals(1.0, calculator.subtraction(-2.0, -3.0), DELTA);
        
        // Test with zero
        assertEquals(5.0, calculator.subtraction(5.0, 0.0), DELTA);
        assertEquals(-5.0, calculator.subtraction(0.0, 5.0), DELTA);
    }

    @Test
    public void testMultiplication() {
        // Test positive numbers
        assertEquals(21.0, calculator.multiplication(3.0, 7.0), DELTA);
        assertEquals(24.0, calculator.multiplication(4.0, 6.0), DELTA);
        
        // Test negative numbers
        assertEquals(-21.0, calculator.multiplication(-3.0, 7.0), DELTA);
        assertEquals(15.0, calculator.multiplication(-3.0, -5.0), DELTA);
        
        // Test with zero
        assertEquals(0.0, calculator.multiplication(5.0, 0.0), DELTA);
        assertEquals(0.0, calculator.multiplication(0.0, 5.0), DELTA);
        
        // Test decimals
        assertEquals(3.75, calculator.multiplication(1.5, 2.5), DELTA);
    }

    @Test
    public void testDivision() {
        // Test positive numbers
        assertEquals(2.0, calculator.division(10.0, 5.0), DELTA);
        assertEquals(3.0, calculator.division(15.0, 5.0), DELTA);
        
        // Test negative numbers
        assertEquals(-2.0, calculator.division(10.0, -5.0), DELTA);
        assertEquals(2.0, calculator.division(-10.0, -5.0), DELTA);
        
        // Test decimals
        assertEquals(2.5, calculator.division(5.0, 2.0), DELTA);
        assertEquals(0.5, calculator.division(1.0, 2.0), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.division(10.0, 0.0);
    }

    @Test
    public void testDivisionByZeroMessage() {
        try {
            calculator.division(10.0, 0.0);
            fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("Division by zero is not allowed", e.getMessage());
        }
    }

}
