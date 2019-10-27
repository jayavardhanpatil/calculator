package com.ase;

/**
 * Created by jayavardhanpatil on 10/25/19
 */
public class Addition implements CalculateOperation {

    public Double calculateResult(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    @Override
    public Double calculateResult(double[] arrayElement) {
        double result = 0;
        for(double element : arrayElement){
            result += element;
        }
        return null;
    }
}
