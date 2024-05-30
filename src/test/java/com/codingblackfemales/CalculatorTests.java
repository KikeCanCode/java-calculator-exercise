package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }
    @Test
    @DisplayName("Multiply two positive numbers")
    public void testMultiplyTwoPositiveNumbers() {
        final Integer product = Calculator.multiply(3, 4);
        assertEquals(12, product);
    }

    @Test
    @DisplayName("Multiply a positive number and a negative number")
    public void testMultiplyPositiveAndNegativeNumbers() {
        final Integer product = Calculator.multiply(3, -4);
        assertEquals(-12, product);
    }


    @Test 
    @DisplayName ("Divide two positive numbers")
    public void testDivideTwoPositiveNumbers() {
        final Double result = Calculator.divide(6.0, 3.0);
        assertEquals(2.0, result);

    }

    @Test
    @DisplayName("Divide a number by itself")
    public void testDivideByItself() {
        final Double result = Calculator.divide(6.0, 6.0);
        assertEquals(1.0, result);
    }
}
