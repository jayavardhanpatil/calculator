package com.ase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class MultiplicationTest {

    final char MULTIPLICATION = '*';

    //Positive test Cases
    @Test
    public void testMultiplicationPositiveNumbers(){
        Calculator calculator = new Calculator();
        double first = 10, second = 20;
        Double expectedValue = (first * second);
        Assert.assertEquals("Multiplication Positive Numbers", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }

    @Test
    public void testMultiplicationNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -5.0, second = -20;
        Double expectedValue = (first * second);
        Assert.assertEquals("Multiplication Negative Numbers", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }

    @Test
    public void testMultiplicationPositiveAndNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -10, second = 20.0;
        Double expectedValue = (first * second);
        Assert.assertEquals("Multiplication Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }

    @Test
    public void testMultiplicationZeroNumbers(){
        Calculator calculator = new Calculator();
        double first = 0, second = 0;
        Double expectedValue = (first * second);
        Assert.assertEquals("Multiplication two Zeros", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }

    @Test
    public void testAddArrayOfElements(){
        Calculator calculator = new Calculator();
        TestUtilities utilities = new TestUtilities();
        double[] elements = {1, 3, 5, 7, 8, 3, 10};
        Double expectedResult = utilities.getProductOfArrayElements(elements);
        Double result = calculator.calculate(elements, MULTIPLICATION);
        Assert.assertEquals("Sum of Array elements ", expectedResult, result);
    }
}
