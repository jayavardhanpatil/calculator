package com.ase;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class Division implements CalculateOperation {
    @Override
    public Double calculateResult(double firstOperand, double secondOperand) {
        if(secondOperand == 0){
            throw new ArithmeticException("devide by zero operation is not supported");
        }
        return firstOperand / secondOperand;
    }
}
