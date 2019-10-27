package com.ase;

/**
 * Created by jayavardhanpatil on 10/26/19
 */
public class TestUtilities {

    public Double getSumOfArrayElements(double[] elements){
        double result = 0;
        for (double element : elements) {
            result += element;
        }
        return result;
    }

    public Double getProductOfArrayElements(double[] elements){
        double result = 0;
        for (double element : elements) {
            result *= element;
        }
        return result;
    }
}
