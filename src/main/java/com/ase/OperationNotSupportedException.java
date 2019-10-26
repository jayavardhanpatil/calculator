package com.ase;

/**
 * Created by jayavardhanpatil on 10/25/19
 */
public class OperationNotSupportedException extends NullPointerException {

    public OperationNotSupportedException(){
        super();
    }

    public OperationNotSupportedException(String message) {
        super(message);
    }

}
