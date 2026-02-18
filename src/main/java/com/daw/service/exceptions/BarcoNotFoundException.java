package com.daw.service.exceptions;

public class BarcoNotFoundException extends RuntimeException {
    public BarcoNotFoundException(String message) {
        super(message);
    }
}
