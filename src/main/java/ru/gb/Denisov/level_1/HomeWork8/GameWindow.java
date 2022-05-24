package ru.gb.Denisov.level_1.HomeWork8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private Field field = new Field();
    private Counter counter = new Counter();



    GameWindow(){
        setTitle("Sapper");
        setBounds(650,300,300,300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        add(field,BorderLayout.CENTER);
        add(counter,BorderLayout.NORTH);
    }



}
