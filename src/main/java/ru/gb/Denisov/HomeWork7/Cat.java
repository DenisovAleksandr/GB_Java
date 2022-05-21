package ru.gb.Denisov.HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name,int appetite){
        this.satiety=false;
        this.name=name;
        this.appetite=appetite;
    }
    public void eat(Plate plate){
        if (plate.info()>appetite){
            satiety=true;
            System.out.println(name+" ate "+appetite+" food!");
            plate.decreaseFood(appetite);
        }else
            System.out.println("Little food for"+name);
    }
    public boolean getSatiety (){
        return this.satiety;
    }
    public String getName(){
        return this.name;
    }
}
