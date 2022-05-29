package ru.gb.Denisov.level_2.HomeWork1;

public interface Team {
    void run (Obstacles obstacles);
    void jump (Obstacles obstacles);
    boolean getComplete();
    void setComplete(boolean result);

}
