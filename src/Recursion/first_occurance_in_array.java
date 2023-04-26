package Recursion;

public class first_occurance_in_array {
    public static  int firstOcuurance(int arr[], int i , int key ){
        if (i==arr.length){
            return -1;
        }
        if (key==arr[i]){
            return i ;
        }
        int a = firstOcuurance(arr,i+1,5);
            return a;
        }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int i =0;
        int key =5;
        System.out.println(firstOcuurance(arr,i,key));
    }
}
