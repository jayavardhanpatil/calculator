package com.ase;

/**
 * Created by jayavardhanpatil on 10/25/19
 */
public class Calculator extends CalculatorFactory{

    public Double calculate(double firstOperand, double secondOperand, char operation){
        CalculateOperation calculateOperation = getCalculateMehod(operation);
        if(calculateOperation != null) {
            return calculateOperation.calculateResult(firstOperand, secondOperand);
        }
        throw new OperationNotSupportedException("Operation not supported");
    }

    public Double calculate(double[] arrayOfElements, char operation){
        CalculateOperation calculateOperation = getCalculateMehod(operation);
        if(calculateOperation != null) {
            return calculateOperation.calculateResult(arrayOfElements);
        }
        throw new OperationNotSupportedException("Operation not supported");
    }
}
