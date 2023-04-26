package Backtracking;

public class nQueens {
    public static boolean isSafe(char board[][], int row, int col) {
        //up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //up left diag
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        //up right diag
        for(int i=row-1, j=col+1; i>=0 && j<board[0].length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static  void nQueen(char board[][], int row){
        if (row== board.length){
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length ; j++) {
            if (isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board,row+1);
                board[row][j] ='X';
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("--------------------------ChessBoard----------------------------");
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char [n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                board[i][j] = 'X';
            }
        }
        nQueen(board,0);
    }
}
