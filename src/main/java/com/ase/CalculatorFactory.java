package com.ase;

/**
 * Created by jayavardhanpatil on 10/25/19
 */

public abstract class CalculatorFactory {

    private final char ADDITION = '+';
    private final char SUBSTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';

    public CalculateOperation getCalculateMehod(char operation){

        if(operation == ADDITION){
            return new Addition();
       /* }else if(operation == SUBSTRACTION){
            return new Substraction();
        }else if(operation == MULTIPLICATION){
            return new Multipilcation();
        }else if(operation == DIVISION){
            return new Division();

        */
        }
        return null;
    }

}
