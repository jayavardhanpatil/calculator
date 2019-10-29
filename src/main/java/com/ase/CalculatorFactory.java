package com.ase;

import com.ase.exception.OperationNotSupportedException;

/**
 * Created by jayavardhanpatil on 10/25/19
 */

abstract class CalculatorFactory {

    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char MODULO = '%';

    CalculateOperation getCalculateMehod(char operation){

        if(operation == ADDITION){
            return new Addition();
        }else if(operation == SUBTRACTION){
            return new Subtraction();
        }else if(operation == MULTIPLICATION){
            return new Multipilcation();
        }else if(operation == DIVISION){
            return new Division();
        }else if(operation == MODULO){
            return new Modulus();
        }else{
            throw new OperationNotSupportedException(operation + " Operation is not supported");
        }
    }

}
