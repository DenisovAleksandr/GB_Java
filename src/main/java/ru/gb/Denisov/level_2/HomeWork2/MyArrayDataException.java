package ru.gb.Denisov.level_2.HomeWork2;

public class MyArrayDataException extends Exception{
    private static final String ERROR_MESSAGE="Element in row %d column %d is not a number!";
    public MyArrayDataException(int i, int j){
        super(String.format(ERROR_MESSAGE,i,j));
    }

}
