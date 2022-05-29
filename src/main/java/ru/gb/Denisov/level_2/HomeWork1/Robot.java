package ru.gb.Denisov.level_2.HomeWork1;

public class Robot implements Team {
    private final double maxHeight = 5;
    private final double maxLength = 15;
    private boolean complete = true;


    @Override
    public void run(Obstacles obstacles) {
        if (obstacles.getDistance() >= maxLength) {
            System.out.print("Robot cant run! Very long distance! Obstacle course failed!");
            setComplete(false);
        } else {
            System.out.print("Robot runs! ");
            setComplete(true);
        }
    }

    @Override
    public void jump(Obstacles obstacles) {
        if (obstacles.getDistance() >= maxHeight) {
            System.out.print("Robot cant jump! Very high distance! Obstacle course failed!");
            setComplete(false);
        } else {
            System.out.print("Robot jumping! ");
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
