package com.ase.utilities;

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
        double result = 1;
        for (double element : elements) {
            result *= element;
        }
        return result;
    }

    public Double getAdditionOfTwoNumbers(double first, double second){
       return first + second;
    }

    public Double getMultiplicationOfTwoNumbers(double first, double second){
        return first * second;
    }

    public Double getDivisionOfTwoNumbers(double first, double second){
        return first / second;
    }

    public Double getSubtractionOfTwoNumbers(double first, double second){
        return first - second;
    }

    public Double getModulusOfTwoNumbers(double first, double second){
        return first % second;
    }

}
