package ru.gb.Denisov.level_1.HomeWork7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food=food;
    }
    public void decreaseFood(int appetite){
        food-=appetite;
        System.out.printf("There are %d food in the plate \n",this.info());
    }
    public int info(){
        return this.food;
    }
    public void setFood(int food){
        this.food+=food;
        System.out.printf("The plate was replenished with %d foods. There are %d foods in the plate \n",food,this.food);
    }
}
