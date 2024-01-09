package com.pabloesanabriaq.practicalunittesting.exceptions;

public class InvalidStringException extends Exception{

    public InvalidStringException(String e){
        super("The value: '" + e + "' can't be reversed");
    }
}
