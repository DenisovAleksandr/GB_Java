package ru.gb.Denisov.level_1.HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    public static final int HEIGHT =5;
    public static final int WIDTH =5;
    public static final int MINES_COUNT =5;
    public static final int MINE =-1;
    public static final int CELL_CLOSED=0;
    public static final int CELL_OPENED=1;

    public static void main(String[] args) {

        play();
    }
    private static void play(){
        int[][] board = generateBoard();
        int[][] moves = new int[HEIGHT][WIDTH];
        while (checkMove(board,moves)){
            printBoard(board,moves);
            move(moves);
        }
        System.out.println("You loss!");
        printBoard(board);
    }
    private static int[][] generateBoard(){
        int[][] board = new int[HEIGHT][WIDTH];
        generateMines(board);
        fillBoard(board);
        return board;
    }
    private static void generateMines (int [][] board){
        Random random = new Random();
        int mines_count = 0;
        while (mines_count!=MINES_COUNT){
            int x,y;
            do{
                x= random.nextInt(HEIGHT);
                y= random.nextInt(WIDTH);
            } while (board[x][y]==MINE);
            board[x][y]=MINE;
            mines_count++;
        };
    }
    private static void fillBoard (int [][] board){
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (board[i][j]==MINE){
                    continue;
                }
                int mCount=0;
                for (int k = i-1; k <= i+1; k++) {
                    for (int l = j-1; l <= j+1; l++) {
                        if (k<0||k>=HEIGHT||l<0||l>=WIDTH){
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
    private static boolean checkMove (int [][] board, int[][]move){
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if ((board[i][j]==MINE)&&(move[i][j]==CELL_OPENED)){
                    return false;
                }
            }
        }
        return true;
    }
    private static void printBoard (int [][] board, int[][]move){
        System.out.print("    ");
        for (char i = 'A'; i <'A'+ WIDTH; i++) {
            System.out.print(i+"  ");
        }
        System.out.println();
        for (int i = 0; i < HEIGHT; i++) {
            System.out.print(i+"  ");
            for (int j = 0; j < WIDTH; j++) {
                if (move[i][j] == CELL_OPENED) {
                    System.out.printf("%2d ", board[i][j]);
                }
            else
                {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
    private static void printBoard (int [][] board){
        System.out.print("    ");
        for (char i = 'A'; i <'A'+ WIDTH; i++) {
            System.out.print(i+"  ");
        }
        System.out.println();
        for (int i = 0; i < HEIGHT; i++) {
            System.out.print(i+" ");
            for (int j = 0; j < WIDTH; j++) {
                if (board[i][j]!=-1) {
                    System.out.printf("%3d", board[i][j]);
                }
                else{System.out.print("  @");
                }
            }
            System.out.println();
        }
    }
    private static int getY (String in){
        int y = in.charAt(0)-'A';
        if(y<0||y>=HEIGHT) {
            return -1;
        }
    return y;
    }
    private static int getX (String in){
        int x;
        String s = in.substring(1);
        x = Integer.valueOf(s);
        if(x<0||x>=WIDTH) {
            return -1;}
    return x;
    }
    private static void move (int[][]moves){
        Scanner scanner = new Scanner(System.in);
        int x=-1;
        int y=-1;

        do {
            System.out.println("Введите номер столбца и номер строки! Нарпример \"A2\":");
            String in = scanner.nextLine();
            x = getX(in);
            y = getY(in);
            if (x == -1 || y == -1) {
                System.out.println("Данные введены не корректно! Повторите ход!");
            }
        }
            while ((x == -1 || y == -1));
                moves[x][y] = 1;
        }
}
