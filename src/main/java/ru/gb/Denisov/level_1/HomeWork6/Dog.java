package ru.gb.Denisov.level_1.HomeWork6;

public class Dog extends Animal {
    final int maxSwim = 10;
    final int maxRun = 500;
    static int ID=0;
    int id;
    public Dog (String name, String color, int birthYear){
        super(name,color,birthYear);
        super.maxSwim=this.maxSwim;
        super.maxRun=this.maxRun;
        this.id=ID+1;
        super.id=this.id;
        ID++;
    }

}
