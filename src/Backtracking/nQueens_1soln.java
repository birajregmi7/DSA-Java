package Backtracking;
public class nQueens_1soln {
    public static  boolean isSafe(char board[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j <= 0; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char[][] board, int row){
        if (row == board.length){
            count++;
            return false;
        }
        for (int j = 0; j < board.length ; j++) {
            if(isSafe(board,row,j)){

            }
        }
        return false;
    }
    static int count = 0;
    public static void main(String[] args) {
        int n= 2;
        char board[][]= new char[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
       if(nQueens(board, 0)){
            System.out.println("possible");
        }else{
            System.out.println("not possible");
        }
        }

    }

