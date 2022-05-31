package ru.gb.Denisov.level_2.HomeWork2;

import java.lang.reflect.Array;

public class HomeWork2 {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"2", "2", "3", "4"},
                {"1", "2", "1", "k"},
                {"2", "2", "3", "4"},
                {"2", "2", "3", "4"}
        };

        try {
            System.out.println(sumArraysElement(array));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    static int sumArraysElement(String[][] array)throws MyArrayDataException, MyArraySizeException{
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (checkString(array[i][j])) {
                    sum += Integer.parseInt(array[i][j]);
                }
                else {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }

    static boolean checkString(String string) {
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (aChar >= '0' && aChar <= '9') {
                return true;
            }
        }
        return false;
    }
}
