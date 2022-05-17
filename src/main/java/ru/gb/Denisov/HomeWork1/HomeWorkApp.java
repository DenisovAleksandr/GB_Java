package ru.gb.Denisov.HomeWork1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords("Orange","Apple", "Banana");
        printThreeWords();

        if(checkSumSign())
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");

        System.out.println(printColor());

        if(compareNumbers())
            System.out.println("a>=b");
        else
            System.out.println("a<b");
    }
    //Создайте метод printThreeWords(), который при вызове должен
    // отпечатать в столбец три слова: Orange, Banana, Apple.

    private static void printThreeWords(String s1, String s2,String s3){
        System.out.println(s1+'\n'+s2+'\n'+s3+'\n' );
    }
    private static void printThreeWords(){
        System.out.println("Orange"+'\n'+"Apple"+'\n'+"Banana");
    }
    private static boolean checkSumSign () {
        int a = 3;
        int b = -2;
        return a+b>=0;
    }
    private static String printColor(){
        int value =0;
        if(value<=0)
            return "Красный";
        else if(value<100)
            return "Желтый";
        else
            return "Зеленый";
    }
    private static boolean compareNumbers (){
        int a=5;
        int b =5;
        return a>=b;
    }
}

