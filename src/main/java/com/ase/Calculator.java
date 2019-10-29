package com.ase;

import com.ase.exception.OperationNotSupportedException;

/**
 * Created by jayavardhanpatil on 10/25/19
 */

class Calculator extends CalculatorFactory{

    Double calculate(double firstOperand, double secondOperand, char operation){
        CalculateOperation calculateOperation = getCalculateMehod(operation);
        if(calculateOperation != null) {
            return calculateOperation.calculateResult(firstOperand, secondOperand);
        }
        throw new OperationNotSupportedException("Operation not supported");
    }

    Double calculate(double[] arrayOfElements, char operation){
        CalculateOperation calculateOperation = getCalculateMehod(operation);
        if(calculateOperation != null) {
            return calculateOperation.calculateResult(arrayOfElements);
        }
        throw new OperationNotSupportedException("Operation not supported");
    }
}
