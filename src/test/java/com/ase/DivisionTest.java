package com.ase;

import com.ase.exception.OperationNotSupportedException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class DivisionTest {


    final char DIVISION = '/';

    //Positive test Cases
    @Test
    public void testDividePositiveNumbers(){
        Calculator calculator = new Calculator();
        double first = 10, second = 20;
        Double expectedValue = (first / second);
        Assert.assertEquals("Division of Positive Numbers", expectedValue, calculator.calculate(first, second, DIVISION));
    }

   @Test
    public void testDivideNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -5.0, second = -20;
        Double expectedValue = (first / second);
        Assert.assertEquals("Division of Negative Numbers", expectedValue, calculator.calculate(first, second, DIVISION));
    }

    @Test
    public void testDividePositiveAndNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -10, second = 20.0;
        Double expectedValue = (first / second);
        Assert.assertEquals("Division of Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, DIVISION));
    }

    @Test
    public void testDivideZeroByNumber(){
        Calculator calculator = new Calculator();
        double first = 0, second = 20;
        Double result = calculator.calculate(first, second, DIVISION);
        Double expectedValue = (first / second);
        Assert.assertEquals("Division of Zero by Numbers", expectedValue, result);
    }

    //Negative Test Cases
    @Test(expected = ArithmeticException.class)
    public void testDivideNumberbyZeroisNotAllowed(){
        Calculator calculator = new Calculator();
        double first = 10, second = 0;
        Double result = calculator.calculate(first, second, DIVISION);
        //Double expectedValue = (first / second);
        //Assert.assertEquals("Division of Zero by Numbers", expectedValue, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideZeroByZeroisNotAllowed(){
        Calculator calculator = new Calculator();
        double first = 0, second = 0;
        Double result = calculator.calculate(first, second, DIVISION);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDivisionOfArrayElementsIsNOtSupported(){
        Calculator calculator = new Calculator();
        double[] elements = {1, 3, 5, 7, 8, 3, 10};
        Double result = calculator.calculate(elements, DIVISION);
    }

}
