package ru.gb.Denisov.level_2.HomeWork1;

public class RunningTrack implements Obstacles{
    private double distance;

    RunningTrack(double distance){
        this.distance=distance;
    }
    @Override
    public double getDistance() {
        return distance;
    }
}
