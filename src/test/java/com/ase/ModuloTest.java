package com.ase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class ModuloTest {

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
    public void testModuloOfZeroNumbers(){
        Calculator calculator = new Calculator();
        double first = 0, second = 0;
        Double expectedValue = (first % second);
        Assert.assertEquals("Modulo of two Zeros", expectedValue, calculator.calculate(first, second, MODULO));
    }
}
