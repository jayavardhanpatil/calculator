package com.ase;

import com.ase.exception.OperationNotSupportedException;
import org.junit.Test;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class UnSupportedOperationTest {

    final char POWER_OPERATION = '^';
    //final char MODULO = '%';

    @Test(expected = OperationNotSupportedException.class)
    public void powerOerationIsNotSupported(){
        Calculator calculator = new Calculator();
        double first = 0, second = 0;
        Double result = calculator.calculate(first, second, POWER_OPERATION);
    }

    /*@Test(expected = OperationNotSupportedException.class)
    public void moduloOerationIsNotSupported(){
        Calculator calculator = new Calculator();
        double first = 0, second = 0;
        Double result = calculator.calculate(first, second, MODULO);
    }*/
}
