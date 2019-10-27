package com.ase;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class Multipilcation implements CalculateOperation {

    @Override
    public Double calculateResult(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public Double calculateResult(double[] elements) {
        double result = 1;
        for (double element: elements) {
            result *= element;
        }
        return result;
    }

}
