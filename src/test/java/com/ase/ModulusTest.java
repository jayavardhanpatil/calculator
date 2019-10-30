package com.ase;

import com.ase.exception.OperationNotSupportedException;
import com.ase.utilities.TestUtilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class ModulusTest {

    final char MODULUS = '%';

    Calculator calculator;
    TestUtilities utilities;

    @Before
    public void initializeCalculatorObject(){
        calculator = new Calculator();
        utilities = new TestUtilities();
    }

    //Positive test Cases
    @Test
    public void testModulusOfPositiveNumbers(){
        double first = 10, second = 20;

        Double expectedValue = utilities.getModulusOfTwoNumbers(first, second);
        Assert.assertEquals("Modulus of Positive Numbers", expectedValue, calculator.calculate(first, second, MODULUS));
    }

    @Test
    public void testModulusOfNegativeNumbers(){
        double first = -5.0, second = -20;

        Double expectedValue = utilities.getModulusOfTwoNumbers(first, second);
        Assert.assertEquals("Modulus Of Negative Numbers", expectedValue, calculator.calculate(first, second, MODULUS));
    }

    @Test
    public void testModulusFlotNumbers(){
        float first = 10.0f, second = 20.0f;

        Double expectedValue = utilities.getModulusOfTwoNumbers(first, second);
        Assert.assertEquals("Modulus of Floating Numbers", expectedValue, calculator.calculate(first, second, MODULUS));
    }

    @Test
    public void testModuludIntegerNumbers(){
        int first = 10, second = 20;

        Double expectedValue = utilities.getModulusOfTwoNumbers(first, second);
        Assert.assertEquals("Modulus of integer Numbers", expectedValue, calculator.calculate(first, second, MODULUS));
    }

    @Test
    public void testModuludDifferentTypesOfNumbers(){
        int first = 10; double second = 20.0;
        Double expectedValue = utilities.getModulusOfTwoNumbers(first, second);
        Assert.assertEquals("Modulus of int and double Numbers", expectedValue, calculator.calculate(first, second, MODULUS));
    }


    @Test
    public void testModulusPositiveAndNegativeNumbers(){
        double first = -10, second = 20.0;
        Double expectedValue = utilities.getModulusOfTwoNumbers(first, second);
        Assert.assertEquals("Modulus Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, MODULUS));
    }

    @Test
    public void testModulusOdZeroByNumber(){
        double first = 0, second = 20;
        Double result = calculator.calculate(first, second, MODULUS);
        Double expectedValue = (first / second);
        Assert.assertEquals("Modulus of Zero by Numbers", expectedValue, result);
    }

    //Negative Test Cases
    @Test(expected = ArithmeticException.class)
    public void testModulusOfNumberbyZeroisNotAllowed(){
        double first = 10, second = 0;
        Double result = calculator.calculate(first, second, MODULUS);
        //Double expectedValue = (first / second);
        //Assert.assertEquals("Division of Zero by Numbers", expectedValue, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testModulusOfZeroByZeroisNotAllowed(){
        double first = 0, second = 0;
        Double result = calculator.calculate(first, second, MODULUS);
        //Double expectedValue = (first / second);
        //Assert.assertEquals("Division of Zero by Numbers", expectedValue, result);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testModulusOfArrayElementsIsNOtSupported(){
        double[] elements = {1, 3, 5, 7, 8, 3, 10};
        Double result = calculator.calculate(elements, MODULUS);
    }
}
