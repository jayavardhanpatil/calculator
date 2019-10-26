package com.ase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class DivisionTest {


    final char DICISION = '/';

    //Positive test Cases
    @Test
    public void testDividePositiveNumbers(){
        Calculator calculator = new Calculator();
        double first = 10, second = 20;
        Double expectedValue = (first / second);
        Assert.assertEquals("Division of Positive Numbers", expectedValue, calculator.calculate(first, second, DICISION));
    }

   @Test
    public void testDivideNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -5.0, second = -20;
        Double expectedValue = (first / second);
        Assert.assertEquals("Division of Negative Numbers", expectedValue, calculator.calculate(first, second, DICISION));
    }

    @Test
    public void testDividePositiveAndNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -10, second = 20.0;
        Double expectedValue = (first / second);
        Assert.assertEquals("Division of Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, DICISION));
    }

    @Test
    public void testDividZeroIntegerByNumber(){
        Calculator calculator = new Calculator();
        int first = 0; double second = 20.0;
        Double expectedValue = (first / second);
        Assert.assertEquals("Division of Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, DICISION));
    }


    //Negative test cases
    @Test(expected = ArithmeticException.class)
    public void testDivideZeroIntegerNumbersNotAllowed(){
        Calculator calculator = new Calculator();
        int first = 0, second = 0;
        Double expectedValue = (double) (first / second);
        Assert.assertEquals("Division of two Zeros", expectedValue, calculator.calculate(first, second, DICISION));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZeroIntegerNumbersNotAllowed(){
        Calculator calculator = new Calculator();
        int first = 10, second = 0;
        Double expectedValue = (double) (first/second);
        Assert.assertEquals("Division of two Zeros", expectedValue, calculator.calculate(first, second, DICISION));
    }
}
