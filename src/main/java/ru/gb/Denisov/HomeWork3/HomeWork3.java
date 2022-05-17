package ru.gb.Denisov.HomeWork3;

import java.sql.Array;
import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        int [] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int [] b = new int[100];
        int [][] c = new int [10][10];
        int[] a1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int [] a2 = {2, 2, 2, 1, 2, 2, 9, 2 };
        int [] a3 ={1,2,3};
        int [] a4 = {3,5,6,1};
        printArray(a);
        change01(a);
        printArray(a);
        fillingArray(b);
        printArray(b);
        fillingDiagonal(c);
        printArray(c);
        printArray(a1);
        System.out.println();
        changeElementsLess6(a1);
        printArray(a1);
        printArray(createArray(10, 5));
        System.out.println("max = "+maxElement(a1));
        System.out.println("min = "+minElement(a1));
        System.out.println("Check Balance: "+checkBalance(a2));
        cyclicShift(a4,-3);
        cyclicShift(a3,1);
        printArray(a3);
        printArray(a4);
    }
    private static void printArray (int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    private static void printArray (int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void change01(int[] a){
        for (int i=0;i<a.length;i++){
            a[i]=Math.abs(a[i]-1);
        }
    }
    private static void fillingArray (int[] a){
        for (int i=0;i<a.length;i++){
            a[i]=i+1;
        }
    }
    private static void changeElementsLess6 (int [] a){
        for (int i=0;i<a.length;i++){
            if (a[i]<6){
                a[i]*=2;
            }
        }
    }
    private static void fillingDiagonal (int[][] c){
        for (int i=0;i<c.length;i++){
            c[i][i]=1;
            c[c.length-1-i][i]=1;
        }
    }
    private static int[] createArray (int len,int initialValue){
        int [] a = new int[len];
        for (int i=0;i<len;i++){
            a[i]=initialValue;
        }
        return a;
    }
    private static int minElement (int[] a){
        int min=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]<min) {
                min=a[i];
            }
        }
        return min;
    }
    private static int maxElement (int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    private static boolean checkBalance (int[] a){
        int sum = Arrays.stream(a).sum();
        int left=0;
        if (sum%2==0){
            for (int i = 0; i < a.length; i++) {
                left+=a[i];
                if(sum/2==left){
                    return true;
                }
            }
            return false;
        }
        else return false;

    }
    private static void cyclicShift (int[] a,int n){
        int temp;
        n=n%a.length;
        if (n==0){
            return;
        }

        if (n>0) {
            for (int i = 0; i < n; i++) {
                temp = a[0];
                System.arraycopy(a,1,a,0,a.length-1);
                a[a.length-1]=temp;
            }
        }
        else {
            n = Math.abs(n);
            for (int i = 0; i < n; i++) {
                temp = a[a.length-1];
                System.arraycopy(a, 0,a,1,a.length-1);
                a[0]=temp;
            }
        }
    }
}
