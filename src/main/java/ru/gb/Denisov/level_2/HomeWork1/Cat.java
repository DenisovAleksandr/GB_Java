package ru.gb.Denisov.level_2.HomeWork1;

public class Cat implements Team {
    private final double maxHeight = 1;
    private final double maxLength = 10;
    private boolean complete = true;

    @Override
    public void run(Obstacles obstacles) {
        if (obstacles.getDistance() >= maxLength) {
            System.out.print("Cat cant run! Very long distance! Obstacle failed!");
            setComplete(false);
        } else {
            System.out.print("Cat runs! ");
            setComplete(true);
        }
    }

    @Override
    public void jump(Obstacles obstacles) {
        if (obstacles.getDistance() >= maxHeight) {
            System.out.print("Cat cant jump! Very high distance! Obstacle failed!");
            setComplete(false);
        } else {
            System.out.print("Cat jumping! ");

            setComplete(true);
        }
    }

    @Override
    public boolean getComplete() {
        return complete;
    }

    @Override
    public void setComplete(boolean result) {
    complete=result;
    }
}
