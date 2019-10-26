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
    public void testPositiveNumbers(){
        double first = 10, second = 20;
        Double expectedValue = (first + second);
        Assert.assertEquals("Addition ", expectedValue, addition.calculateResult(first, second));
    }
}
