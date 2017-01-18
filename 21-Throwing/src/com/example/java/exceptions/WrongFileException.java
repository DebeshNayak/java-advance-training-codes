package com.example.java.exceptions;

/**
 * Created by debes on 17-01-2017.
 */
public class WrongFileException extends Exception {
    public static final long serialVersionUID = 42L;

    @Override
    public String getMessage() {
        return "You chose the wrong file!";
    }
}
