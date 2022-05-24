package ru.gb.Denisov.level_1.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Field extends JPanel {

    private final int fieldCols=setFieldCols(Sapper.getSettings());
    private final int fieldRows=getFieldRows(Sapper.getSettings());

    int[][] fieldWithMine = new int[fieldCols][fieldRows];
    JButton[][] buttons = new JButton[fieldRows][fieldCols];

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int cols=-1;
            int rows=-1;
            JButton button = (JButton) e.getSource();
            for (int i = 0; i < fieldRows; i++) {
                for (int j = 0; j < fieldCols; j++) {
                    if (buttons[i][j].equals(button)){
                        cols=i;
                        rows=j;
                    }
                }
            }
            Sapper.move(cols,rows);
            if (Sapper.getValue(cols,rows)!=-1){
                if(!Sapper.checkWin()){
                    paintField();
                }else {
                    paintWin();
                }
            } else {
                paintGameOver();
            }
        }
    };

    Field(){
    paintField();
    }

    void paintField(){
        removeAll();
        repaint();
        revalidate();
        setLayout(new GridLayout(fieldRows,fieldCols));
        for (int i = 0; i < fieldRows; i++) {
            for (int j = 0; j < fieldCols; j++) {
                if (Sapper.checkMove(i,j)){
                    add(new JLabel(String.valueOf(Sapper.getValue(i,j))));
                    continue;
                }
                buttons[i][j]=new JButton();
                add(buttons[i][j]);
                buttons[i][j].addActionListener(listener);
            }
        }
    }
    private int setFieldCols(int[] a){
        return a[0];
    }
    private int getFieldRows (int[] a){
        return a[1];
    }
    private void paintGameOver(){
        removeAll();
        repaint();
        revalidate();
        JButton button = new JButton("New Game");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sapper.play();
                paintField();
            }
        });
        setLayout(new BorderLayout());
        JLabel label = new JLabel();
        add(new JLabel("Game Over",SwingConstants.CENTER),BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);
    }
    private void paintWin(){
        removeAll();
        repaint();
        revalidate();
        JButton button = new JButton("New Game");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sapper.play();
                paintField();
            }
        });
        setLayout(new BorderLayout());
        add(new JLabel("YOU WIN!"),SwingConstants.CENTER);
        add(button,BorderLayout.SOUTH);
    }
}

