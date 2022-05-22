package ru.gb.Denisov.HomeWork8;

import javax.swing.*;
import java.awt.*;

public class Counter extends JPanel {
    Counter(){
        setLayout(new GridLayout(1,3));
        JLabel Jlabel = new JLabel("Mine :");
        JLabel mineCount = new JLabel(String.valueOf(Sapper.getSettings()[2]));
        add(Jlabel);
        add(mineCount);
    }
}
