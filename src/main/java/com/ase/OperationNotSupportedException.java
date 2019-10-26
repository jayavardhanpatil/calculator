package com.ase;

/**
 * Created by jayavardhanpatil on 10/25/19
 */
public class OperationNotSupportedException extends Exception {

    OperationNotSupportedException(String message) {
        super(message);
        System.err.println(message);
    }

}
