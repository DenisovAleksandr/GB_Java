package ru.gb.Denisov.level_2.HomeWork1;

public class Human implements Team {
    private final double maxHeight = 2;
    private final double maxLength = 12;
    private boolean complete = true;

    @Override
    public void run(Obstacles obstacles) {
        if (obstacles.getDistance() >= maxLength) {
            System.out.print("Human cant run! Very long distance! Obstacle course failed!");
            setComplete(false);
        } else {
            System.out.print("Human runs! ");
            setComplete(true);
        }
    }

    @Override
    public void jump(Obstacles obstacles) {
        if (obstacles.getDistance() >= maxHeight) {
            System.out.print("Human cant jump! Very high distance! Obstacle course failed!");
            setComplete(false);
        } else {
            System.out.print("Human jumping! ");
            setComplete(true);
        }
    }

    @Override
    public boolean getComplete() {
        return complete;
    }

    @Override
    public void setComplete(boolean result) {
        complete = result;
    }
}
