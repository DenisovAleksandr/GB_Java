package ru.gb.Denisov.HomeWork8;

import java.util.Random;

public class Sapper {

    private static int ROWS=9;
    private static int COLS=9;
    private static int MINES_COUNT=10;
    private static final int MINE =-1;
    private static final int CELL_CLOSED=0;
    private static final int CELL_OPENED=1;
    private static int[][] moves = new int[ROWS][COLS];
    private static int[][] board = new int[ROWS][COLS];
    private static int count_moves;

    public static void main(String[] args) {

        new Settings();


    }

    public static void play(){
        moves = new int[ROWS][COLS];
        board = new int[ROWS][COLS];
        closeMove();
        generateBoard();
        new GameWindow();

    }
    public static void generateBoard(){
        generateMines();
        fillBoard();
    }
    public static void closeMove(){
        count_moves=0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                moves[i][j]=CELL_CLOSED;
            }
        }
    }
    public static void generateMines (){
        Random random = new Random();
        int mines_count = 0;
        while (mines_count!=MINES_COUNT){
            int x,y;
            do{
                x= random.nextInt(ROWS);
                y= random.nextInt(COLS);
            } while (board[x][y]==MINE);
            board[x][y]=MINE;
            mines_count++;
        };
    }
    public static void fillBoard (){
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j]==MINE){
                    continue;
                }
                int mCount=0;
                for (int k = i-1; k <= i+1; k++) {
                    for (int l = j-1; l <= j+1; l++) {
                        if (k<0||k>= ROWS ||l<0||l>= COLS){
                            continue;
                        }
                        if (board[k][l]==MINE){
                            mCount++;
                        }
                    }
                }
                board[i][j]=mCount;
            }
        }
    }
    public static boolean checkMove (int i,int j){
        if (moves[i][j]!=CELL_OPENED) {
            return false;
        }
        return true;
    }
    public static void move (int x, int y){
        while ((x == -1 || y == -1));
        moves[x][y] = 1;
        count_moves++;
    }
    public static int getValue (int i, int j){
        return board[i][j];
    }
    public static boolean checkWin(){
        if (count_moves== ROWS * COLS -MINES_COUNT){
            return true;
        } else {
            return false;
        }
    }
    public static int[] getSettings(){
        int[] a = new int[3];
        a[0]= COLS;
        a[1]= ROWS;
        a[2]=MINES_COUNT;
        return a;
    }
    public static void setSettings(int rows, int cols, int mines_count){
        COLS=cols;
        ROWS=rows;
        MINES_COUNT=mines_count;
    }
}
