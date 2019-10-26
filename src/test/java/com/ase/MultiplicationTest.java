package com.ase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class MultiplicationTest {

    final char Multiplication = '*';

    //Positive test Cases
    @Test
    public void testMultiplicationPositiveNumbers(){
        Calculator calculator = new Calculator();
        double first = 10, second = 20;
        Double expectedValue = (first * second);
        Assert.assertEquals("Multiplication Positive Numbers", expectedValue, calculator.calculate(first, second, Multiplication));
    }

    @Test
    public void testMultiplicationNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -5.0, second = -20;
        Double expectedValue = (first * second);
        Assert.assertEquals("Multiplication Negative Numbers", expectedValue, calculator.calculate(first, second, Multiplication));
    }

    @Test
    public void testMultiplicationPositiveAndNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -10, second = 20.0;
        Double expectedValue = (first * second);
        Assert.assertEquals("Multiplication Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, Multiplication));
    }

    @Test
    public void testMultiplicationZeroNumbers(){
        Calculator calculator = new Calculator();
        double first = 0, second = 0;
        Double expectedValue = (first * second);
        Assert.assertEquals("Multiplication two Zeros", expectedValue, calculator.calculate(first, second, Multiplication));
    }

}
