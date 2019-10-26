package com.ase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class SubstractionTest {

    final char SUBSTRACTION = '-';

    //Positive test Cases
    @Test
    public void testAddPositiveNumbers(){
        Calculator calculator = new Calculator();
        double first = 10, second = 20;
        Double expectedValue = (first - second);
        Assert.assertEquals("Substraction Positive Numbers", expectedValue, calculator.calculate(first, second, SUBSTRACTION));
    }

    @Test
    public void testAddNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -5.0, second = -20;
        Double expectedValue = (first - second);
        Assert.assertEquals("Substraction Negative Numbers", expectedValue, calculator.calculate(first, second, SUBSTRACTION));
    }

    @Test
    public void testAddPositiveAndNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -10, second = 20.0;
        Double expectedValue = (first - second);
        Assert.assertEquals("Substraction Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, SUBSTRACTION));
    }

    @Test
    public void testAddZeroNumbers(){
        Calculator calculator = new Calculator();
        double first = 0, second = 0;
        Double expectedValue = (first - second);
        Assert.assertEquals("Substraction two Zeros", expectedValue, calculator.calculate(first, second, SUBSTRACTION));
    }

}
