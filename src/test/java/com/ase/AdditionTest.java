package com.ase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/25/19
 */
public class AdditionTest {

    private Addition addition = new Addition();

    //Positive test Cases
    @Test
    public void testAddPositiveNumbers(){
        double first = 10, second = 20;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition ", expectedValue, addition.calculateResult(first, second));
    }

    @Test
    public void testAddNegativeNumbers(){
        double first = -5.0, second = -20;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition ", expectedValue, addition.calculateResult(first, second));
    }

    @Test
    public void testAddPositiveAndNegativeNumbers(){
        double first = -10, second = 20.0;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition ", expectedValue, addition.calculateResult(first, second));
    }

    @Test
    public void testAddZeroNumbers(){
        double first = 0, second = 0;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition ", expectedValue, addition.calculateResult(first, second));
    }
}
