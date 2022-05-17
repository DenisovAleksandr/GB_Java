package ru.gb.Denisov.HomeWork2;

public class HomeWork2 {

    public static void main(String[] args) {
        final int year =1500;
        System.out.println(checkSumBetween(10,0));
        checkPositive(-5);
        System.out.println(checkPositiveBool(-5));
        printString("Hello World",3);
        System.out.print(year+"-й год ");
        if (visokos(year))
            System.out.println("високосный!");
        else
            System.out.println("не високосный!");
    }

    private static boolean checkSumBetween(int a,int b){
        return (a+b>=10)&&(a+b<=20);
    }
    private static void checkPositive (int a){
        if (a>=0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
    }
    private static boolean checkPositiveBool (int a){
        return !(a>=0);
    }
    private static void printString (String s, int a){
        for (int i=0;i<a;i++){
            System.out.println(s);
        }
    }
    private static boolean visokos (int year) {
        return !(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0));
    }
}
