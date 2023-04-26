package AdvanceLoops;

public class PrintHollowRectangle {
    public static void hollowRectangle(int rowlength, int columnlength){
        //outer loop
        for (int i = 1; i <=rowlength ; i++) {
            for (int j = 1; j <=columnlength ; j++) {
                if (i==1 || i==rowlength || j==1 ||j==columnlength){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(4,5);
    }
}
