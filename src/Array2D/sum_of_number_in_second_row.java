package Array2D;

public class sum_of_number_in_second_row {
    public static int sumofarray(int matrix[][]){
        int totalsum = 0;
        for (int i = 1; i < matrix.length-1 ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                totalsum += matrix[i][j];
            }
        }
        System.out.println(totalsum);
        return totalsum;
    }
    public static void main(String[] args) {
        int matrix[][] ={{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        sumofarray(matrix);
    }
}
