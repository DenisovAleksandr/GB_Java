package ru.gb.Denisov.level_2.HomeWork2;

public class MyArraySizeException extends Exception{
    private static final String ERROR_MESSAGE = "Invalid length array";
    public MyArraySizeException(){
        super(ERROR_MESSAGE);
    }

    
}
