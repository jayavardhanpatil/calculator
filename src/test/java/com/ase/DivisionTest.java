package com.ase;

import com.ase.exception.OperationNotSupportedException;
import com.ase.utilities.TestUtilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class DivisionTest {


    final char DIVISION = '/';

    Calculator calculator;
    TestUtilities utilities;

    @Before
    public void initializeCalculatorObject(){
        calculator = new Calculator();
        utilities = new TestUtilities();
    }

    //Positive test Cases
    @Test
    public void testDividePositiveNumbers(){
        double first = 10, second = 20;

        Double expectedValue = utilities.getDivisionOfTwoNumbers(first, second);
        Assert.assertEquals("Division of Positive Numbers", expectedValue, calculator.calculate(first, second, DIVISION));
    }

   @Test
    public void testDivideNegativeNumbers(){
        double first = -5.0, second = -20;

        Double expectedValue = utilities.getDivisionOfTwoNumbers(first, second);
        Assert.assertEquals("Division of Negative Numbers", expectedValue, calculator.calculate(first, second, DIVISION));
    }

    @Test
    public void testDividePositiveAndNegativeNumbers(){
        double first = -10, second = 20.0;

        Double expectedValue = utilities.getDivisionOfTwoNumbers(first, second);
        Assert.assertEquals("Division of Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, DIVISION));
    }

    @Test
    public void testDivideZeroByNumber(){
        double first = 0, second = 20;

        Double result = calculator.calculate(first, second, DIVISION);
        Double expectedValue = utilities.getDivisionOfTwoNumbers(first, second);
        Assert.assertEquals("Division of Zero by Numbers", expectedValue, result);
    }

    @Test
    public void testDividFlotNumbers(){
        float first = 16.5f, second = 5.5f;

        Double expectedValue = utilities.getDivisionOfTwoNumbers(first, second);
        Assert.assertEquals("Division of float Numbers", expectedValue, calculator.calculate(first, second, DIVISION));
    }

    @Test
    public void testDivideIntegerNumbers(){
        int first = 10, second = 20;

        Double expectedValue = utilities.getDivisionOfTwoNumbers(first, second);
        Assert.assertEquals("Division of integer Numbers", expectedValue, calculator.calculate(first, second, DIVISION));
    }

    @Test
    public void testDivisionDifferentTypesOfNumbers(){
        int first = 10; double second = 20.0;

        Double expectedValue = utilities.getDivisionOfTwoNumbers(first, second);
        Assert.assertEquals("Division of int and double Numbers", expectedValue, calculator.calculate(first, second, DIVISION));
    }


    //Negative Test Cases
    @Test(expected = ArithmeticException.class)
    public void testDivideNumberbyZeroisNotAllowed(){
        double first = 10, second = 0;

        Double result = calculator.calculate(first, second, DIVISION);
        //Double expectedValue = utilities.getDivisionOfTwoNumbers(first, second);
        //Assert.assertEquals("Division of Zero by Numbers", expectedValue, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideZeroByZeroisNotAllowed(){
        double first = 0, second = 0;
        Double result = calculator.calculate(first, second, DIVISION);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDivisionOfArrayElementsIsNOtSupported(){
        double[] elements = {1, 3, 5, 7, 8, 3, 10};
        Double result = calculator.calculate(elements, DIVISION);
    }

}
