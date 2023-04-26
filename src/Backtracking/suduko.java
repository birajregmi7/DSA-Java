package Backtracking;

public class suduko {
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit){
        // row
        for (int i = 0; i <9 ; i++) {
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //col
        for (int j = 0; j <9 ; j++) {
            if (sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for (int i = sr; i <sr+3 ; i++) {
            for ( int j = sc; j <sc+3 ; j++) {
                if (sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudukoSolver(int sudoku[][], int row, int col){
        // base case
        if(row==9 ){
            return true;
        }
        //recursion
        int nextRow = row;
        int nextCol = col+1;
        if (col+1==9){
            nextRow = row+1;
            nextCol = 0;
        }
        if (sudoku[row][col]!=0){
            return sudukoSolver(sudoku,nextRow,nextCol);
        }
        for (int digit = 1; digit <=9 ; digit++) {
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if (sudukoSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }

        }
        return false;
    }

    public static void PrintSudoku(int sudoku[][]){
        for (int i = 0; i <sudoku.length ; i++) {
            for (int j = 0; j <sudoku.length ; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3} };
       if (sudukoSolver(sudoku,0,0)){
           System.out.println("solution exists");
           PrintSudoku(sudoku);
       }else {
           System.out.println("solution doesnt exist");
       }

    }
}
