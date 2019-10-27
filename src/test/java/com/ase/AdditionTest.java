package com.ase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/25/19
 */
public class AdditionTest {

    final char ADDITION = '+';

    //Positive test Cases
    @Test
    public void testAddPositiveNumbers(){
        Calculator calculator = new Calculator();
        double first = 10, second = 20;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition Positive Numbers", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -5.0, second = -20;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition Negative Numbers", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddPositiveAndNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -10, second = 20.0;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddZeroNumbers(){
        Calculator calculator = new Calculator();
        double first = 0, second = 0;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition two Zeros", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddArrayOfElements(){
        Calculator calculator = new Calculator();
        TestUtilities utilities = new TestUtilities();
        double[] elements = {1, 3, 5, 7, 8, 3, 10};
        Double expectedResult = utilities.getSumOfArrayElements(elements);
        Double result = calculator.calculate(elements, ADDITION);
        Assert.assertEquals("Sum of Array elements ", expectedResult, result);
    }

}
