package week1examples;

import java.util.Random;

public class TicTacToeBoardExample {
    public static void main(String[] args) {
        int [][] board = new int[3][3];
        Random rand = new Random(); //for randomly fills the board

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = rand.nextInt(2); //0 or 1
            }
        }

        System.out.println("Board is created which is as follows:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Statistics:");

        for (int i = 0; i < 3; i++) {
            if(checkRow(board,i,0)){
                System.out.print("All 0s on row" + i);
            } else if (checkRow(board, i, 1)) {
                System.out.println("All 1s on row" + i);

            }
        }

        for(int j = 0; j < 3; j++) {
            if(checkCol(board,j,0)){
                System.out.println("All 0s on column" + j);
            }
            else if (checkCol(board, j, 1)) {
                System.out.println("All 1s on column" + j);
            }
        }


    }


    public static boolean checkRow(int[][] board, int row, int value) {
        for (int i = 0; i < 3; i++) {
            if(board[row][i] != value){
                return false;
            }
        }
        return true;
    }

    public static boolean checkCol(int[][] board, int col, int value) {
        for (int i = 0; i < 3; i++) {
            if(board[i][col] != value){
                return false;
            }
        }

        return true;
    }
}
