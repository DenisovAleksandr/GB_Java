package ru.gb.Denisov.HomeWork6;

public class Cat extends Animal {
    final int maxRun = 200;
    static int ID = 0;

    public Cat(String name, String color, int birthYear) {
        super(name, color, birthYear);
        super.maxRun = this.maxRun;
        this.id = ID + 1;
        super.id = this.id;
        ID++;
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " cant swim ");
    }
}
