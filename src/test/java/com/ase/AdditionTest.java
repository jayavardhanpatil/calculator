package com.ase;

import com.ase.utilities.TestUtilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/25/19
 */
public class AdditionTest {

    final char ADDITION = '+';
    Calculator calculator;
    TestUtilities utilities;

    @Before
    public void initializeCalculatorObject(){
        calculator = new Calculator();
        utilities = new TestUtilities();
    }

    //Positive test Cases
    @Test
    public void testAddPositiveNumbers(){
        double first = 10.1, second = 20.2;

        Double expectedValue = utilities.getAdditionOfTwoNumbers(first, second);
        Assert.assertEquals("Addition Positive Numbers", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddFlotNumbers(){
        float first = 10.0f, second = 20.1f;

        Double expectedValue = utilities.getAdditionOfTwoNumbers(first, second);
        Assert.assertEquals("Addition Floating Numbers", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddIntegerNumbers(){
        int first = 10, second = 20;

        Double expectedValue = utilities.getAdditionOfTwoNumbers(first, second);
        Assert.assertEquals("Addition integer Numbers", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddDifferentTypesOfNumbers(){
        int first = 10; double second = 20.3;

        Double expectedValue = utilities.getAdditionOfTwoNumbers(first, second);
        Assert.assertEquals("Addition int and double Numbers", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddNegativeNumbers(){
        double first = -5.0, second = -20;

        Double expectedValue = utilities.getAdditionOfTwoNumbers(first, second);
        Assert.assertEquals("Addition Negative Numbers", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddPositiveAndNegativeNumbers(){
        double first = -10, second = 20.0;

        Double expectedValue = utilities.getAdditionOfTwoNumbers(first, second);
        Assert.assertEquals("Addition Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddZeroNumbers(){
        double first = 0, second = 0;

        Double expectedValue = utilities.getAdditionOfTwoNumbers(first, second);
        Assert.assertEquals("Addition two Zeros", expectedValue, calculator.calculate(first, second, ADDITION));
    }

    @Test
    public void testAddArrayOfElements(){
        double[] elements = {1, 3, 5, 7, 8, 3, 10};

        Double expectedResult = utilities.getSumOfArrayElements(elements);
        Double result = calculator.calculate(elements, ADDITION);

        Assert.assertEquals("Sum of Array elements ", expectedResult, result);
    }
}
