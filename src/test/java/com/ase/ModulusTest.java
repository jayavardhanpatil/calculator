package com.ase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class ModulusTest {

    final char MODULO = '%';

    //Positive test Cases
    @Test
    public void testModuloOfPositiveNumbers(){
        Calculator calculator = new Calculator();
        double first = 10, second = 20;
        Double expectedValue = (first % second);
        Assert.assertEquals("Modulo of Positive Numbers", expectedValue, calculator.calculate(first, second, MODULO));
    }

    @Test
    public void testModuloOfNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -5.0, second = -20;
        Double expectedValue = (first % second);
        Assert.assertEquals("Modulo Of Negative Numbers", expectedValue, calculator.calculate(first, second, MODULO));
    }

    @Test
    public void testModuloPositiveAndNegativeNumbers(){
        Calculator calculator = new Calculator();
        double first = -10, second = 20.0;
        Double expectedValue = (first % second);
        Assert.assertEquals("Modulo Positive and Negative Numbers", expectedValue, calculator.calculate(first, second, MODULO));
    }

    @Test
    public void testModulusOdZeroByNumber(){
        Calculator calculator = new Calculator();
        double first = 0, second = 20;
        Double result = calculator.calculate(first, second, MODULO);
        Double expectedValue = (first / second);
        Assert.assertEquals("Division of Zero by Numbers", expectedValue, result);
    }

    //Negative Test Cases
    @Test(expected = ArithmeticException.class)
    public void testModulusOfNumberbyZeroisNotAllowed(){
        Calculator calculator = new Calculator();
        double first = 10, second = 0;
        Double result = calculator.calculate(first, second, MODULO);
        //Double expectedValue = (first / second);
        //Assert.assertEquals("Division of Zero by Numbers", expectedValue, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testModulusOfZeroByZeroisNotAllowed(){
        Calculator calculator = new Calculator();
        double first = 0, second = 0;
        Double result = calculator.calculate(first, second, MODULO);
        //Double expectedValue = (first / second);
        //Assert.assertEquals("Division of Zero by Numbers", expectedValue, result);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testModulusOfArrayElementsIsNOtSupported(){
        Calculator calculator = new Calculator();
        double[] elements = {1, 3, 5, 7, 8, 3, 10};
        Double result = calculator.calculate(elements, MODULO);
    }
}
