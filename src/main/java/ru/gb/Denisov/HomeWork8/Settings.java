package ru.gb.Denisov.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame {
    JRadioButton radioButtonE = new JRadioButton("Easy",true);
    JRadioButton radioButtonN = new JRadioButton("Normal");
    JRadioButton radioButtonH = new JRadioButton("Hard");
    JButton button = new JButton("Start new game");


    Settings(){
        setTitle("Settings");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setValueRadio();
                setVisible(false);
                Sapper.play();

            }
        });
        setBounds(800,300,300,200);
        setLayout(new GridLayout(4,1));
        ButtonGroup group = new ButtonGroup();
        group.add(radioButtonE);
        group.add(radioButtonN);
        group.add(radioButtonH);
        add(radioButtonE);
        add(radioButtonN);
        add(radioButtonH);
        add(button);

        setVisible(true);
    }
    void setValueRadio(){
        if (radioButtonE.isSelected()){
            Sapper.setSettings(9,9,10);
        } else
        if (radioButtonN.isSelected()){
            Sapper.setSettings(16,16,40);
        } else
        if (radioButtonH.isSelected()){
            Sapper.setSettings(16,30,99);
        }
    }
}
