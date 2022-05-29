package ru.gb.Denisov.level_2.HomeWork1;

public class Wall implements Obstacles {
    private double distance;
    public Wall(double distance){
        this.distance=distance;
    }


    @Override
    public double getDistance() {
        return distance;
    }
}
