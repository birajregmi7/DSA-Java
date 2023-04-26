package Array2D;

public class diagonal_sum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        for (int i = 0; i <matrix.length ; i++) {
            sum += matrix[i][i];
            if (i != matrix.length-i-1) {
                sum += matrix[i][matrix[0].length - i - 1];
            }
            }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
}
