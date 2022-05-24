package ru.gb.Denisov.level_1.HomeWork6;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int birthYear;
    protected int maxRun;
    protected int maxSwim;
    protected int id;
    static int ID=0;

    public Animal (String name, String color, int birthYear){
        this.name = name;
        this.color = color;
        this.birthYear=birthYear;
        ID++;
    }
    void run() {System.out.println(name + " Run!");}
    void run (int distance){
        if (distance<=maxRun&&distance>0){
            System.out.println(name +" has run "+ distance + "m");
        }else System.out.println(name+" cant run "+distance+ "m. It's very long distance for "+name);
    }

    void swim(){System.out.println(name + " Swim!");}
    void swim (int distance){
        if (distance<=maxSwim&&distance>0){
            System.out.println(name +" has swum "+ distance + "m");
        }else System.out.println(name+" cant swim "+distance+ "m. It's very long distance for "+name);
    }
    int getID (){
        return this.id;
    }
}
