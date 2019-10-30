package com.ase;

import com.ase.utilities.TestUtilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class MultiplicationTest {

    final char MULTIPLICATION = '*';

    Calculator calculator;
    TestUtilities utilities;

    @Before
    public void initializeCalculatorObject(){
        calculator = new Calculator();
        utilities = new TestUtilities();
    }

    //Positive test Cases
    @Test
    public void testMultiplicationPositiveNumbers(){
        double first = 10, second = 20;
        Double expectedValue = utilities.getMultiplicationOfTwoNumbers(first, second);
        Assert.assertEquals("Multiplication Positive Numbers", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }

    @Test
    public void testMultiplicationNegativeNumbers(){
        double first = -5.0, second = -20;
        Double expectedValue = utilities.getMultiplicationOfTwoNumbers(first, second);
        Assert.assertEquals("Multiplication Negative Numbers", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }

    @Test
    public void testMultiplicationPositiveAndNegativeNumbers(){
        double first = -10, second = 20.0;
        Double expectedValue = utilities.getMultiplicationOfTwoNumbers(first, second);
        Assert.assertEquals("Multiplication Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }

    @Test
    public void testMultiplicationZeroNumbers(){
        double first = 0, second = 0;
        Double expectedValue = utilities.getMultiplicationOfTwoNumbers(first, second);
        Assert.assertEquals("Multiplication two Zeros", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }


    @Test
    public void testMultiplicatioFlotNumbers(){
        float first = 10.0f, second = 20.5f;
        Double expectedValue = utilities.getMultiplicationOfTwoNumbers(first, second);
        Assert.assertEquals("Multiplication of Floating Numbers", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }

    @Test
    public void testMultiplicationIntegerNumbers(){
        int first = 10, second = 20;
        Double expectedValue = utilities.getMultiplicationOfTwoNumbers(first, second);
        Assert.assertEquals("Multiplication of integer Numbers", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }

    @Test
    public void testMultiplicationDifferentTypesOfNumbers(){
        int first = 10; double second = 20.3;
        Double expectedValue = utilities.getMultiplicationOfTwoNumbers(first, second);

        Assert.assertEquals("Multiplication of int and double Numbers", expectedValue, calculator.calculate(first, second, MULTIPLICATION));
    }

    @Test
    public void testMultiplicationOfArrayElements(){
        double[] elements = {1, 3, 5, 7, 8, 3, 10};
        Double expectedResult = utilities.getProductOfArrayElements(elements);
        Double result = calculator.calculate(elements, MULTIPLICATION);
        Assert.assertEquals("Multiplication of Array elements ", expectedResult, result);
    }
}
