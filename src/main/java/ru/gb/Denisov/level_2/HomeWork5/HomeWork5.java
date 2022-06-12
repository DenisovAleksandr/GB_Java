package ru.gb.Denisov.level_2.HomeWork5;

import java.lang.reflect.Array;

public class HomeWork5 {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] arg) {
        float[] arr = new float[size];
        for (float a : arr) {
            a = 1;
        }
        CurrentTimeThread timeThread = new CurrentTimeThread(arr);
        timeThread.oneThread();
        timeThread.twoThread();
    }
}
