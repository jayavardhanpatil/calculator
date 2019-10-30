package com.ase;

import com.ase.exception.OperationNotSupportedException;
import com.ase.utilities.TestUtilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class SubtractionTest {

    final char SUBTRACTION = '-';

    Calculator calculator;
    TestUtilities utilities;

    @Before
    public void initializeCalculatorObject(){
        calculator = new Calculator();
        utilities = new TestUtilities();
    }

    //Positive test Cases
    @Test()
    public void testSubtractPositiveNumbers(){
        double first = 10, second = 20;
        Double expectedValue = utilities.getSubtractionOfTwoNumbers(first, second);
        Assert.assertEquals("Substraction Positive Numbers", expectedValue, calculator.calculate(first, second, SUBTRACTION));
    }

    @Test
    public void testSubtractNegativeNumbers(){
        double first = -5.0, second = -20;
        Double expectedValue = utilities.getSubtractionOfTwoNumbers(first, second);
        Assert.assertEquals("Substraction Negative Numbers", expectedValue, calculator.calculate(first, second, SUBTRACTION));
    }

    @Test
    public void testSubtractionFlotNumbers(){
        float first = 10.0f, second = 20.1f;
        Double expectedValue = utilities.getSubtractionOfTwoNumbers(first, second);
        Assert.assertEquals("Subtraction Floating Numbers", expectedValue, calculator.calculate(first, second, SUBTRACTION));
    }

    @Test
    public void testSubtractionIntegerNumbers(){
        int first = 10, second = 20;
        Double expectedValue = utilities.getSubtractionOfTwoNumbers(first, second);
        Assert.assertEquals("Subtraction integer Numbers", expectedValue, calculator.calculate(first, second, SUBTRACTION));
    }

    @Test
    public void testSubtractionDifferentTypesOfNumbers(){
        int first = 10; double second = 20.3;
        Double expectedValue = utilities.getSubtractionOfTwoNumbers(first, second);
        Assert.assertEquals("Subtraction int and double Numbers", expectedValue, calculator.calculate(first, second, SUBTRACTION));
    }

    @Test
    public void testSubtractPositiveAndNegativeNumbers(){
        double first = -10, second = 20.0;
        Double expectedValue = utilities.getSubtractionOfTwoNumbers(first, second);
        Assert.assertEquals("Substraction Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, SUBTRACTION));
    }

    @Test
    public void testSubtractZeroNumbers(){
        double first = 0, second = 0;
        Double expectedValue = utilities.getSubtractionOfTwoNumbers(first, second);
        Assert.assertEquals("Substraction two Zeros", expectedValue, calculator.calculate(first, second, SUBTRACTION));
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDivisionOfArrayElementsIsNOtSupported(){
        double[] elements = {1, 3, 5, 7, 8, 3, 10};
        Double result = calculator.calculate(elements, SUBTRACTION);
    }
}
