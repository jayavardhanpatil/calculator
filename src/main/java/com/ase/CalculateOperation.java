package com.ase;

import com.ase.exception.OperationNotSupportedException;

/**
 * Created by jayavardhanpatil on 10/25/19
 */

public interface CalculateOperation {
    
    Double calculateResult(double firstOperand, double secondOperand);

    default Double calculateResult(double[] arrayElement){
        throw new OperationNotSupportedException("Operation on Array of elements is not allowed");
    };

}
