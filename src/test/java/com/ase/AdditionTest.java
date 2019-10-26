package com.ase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/25/19
 */
public class AdditionTest {

    //Positive test Cases
    @Test
    public void testAddPositiveNumbers(){
        Addition addition = new Addition();
        double first = 10, second = 20;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition Positive Numbers", expectedValue, addition.calculateResult(first, second));
    }

    @Test
    public void testAddNegativeNumbers(){
        Addition addition = new Addition();
        double first = -5.0, second = -20;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition Negative Numbers", expectedValue, addition.calculateResult(first, second));
    }

    @Test
    public void testAddPositiveAndNegativeNumbers(){
        Addition addition = new Addition();
        double first = -10, second = 20.0;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition Positive and Negative Numbers", expectedValue, addition.calculateResult(first, second));
    }

    @Test
    public void testAddZeroNumbers(){
        Addition addition = new Addition();
        double first = 0, second = 0;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition two Zeros", expectedValue, addition.calculateResult(first, second));
    }

}
