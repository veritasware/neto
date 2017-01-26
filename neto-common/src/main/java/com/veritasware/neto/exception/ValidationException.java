package com.veritasware.neto.exception;

import com.veritasware.neto.exception.NetoException;

/**
 * Created by chacker on 2016-11-01.
 */
public class ValidationException extends NetoException {
    public ValidationException(int errorCode, String message, Object... objs) {
        super(errorCode, message, objs);
    }
}
