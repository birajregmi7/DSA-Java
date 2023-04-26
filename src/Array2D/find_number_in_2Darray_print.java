package Array2D;

public class find_number_in_2Darray_print {
    public static void findNum(int matrix[][]){
        int num = 7;
        int count =0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                if (matrix[i][j]==num){
                    count++;
                }
            }

        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int matrix[][] ={{4,7,8},
                        {8,8,7}};
        findNum(matrix);

    }
}
