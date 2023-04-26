package Recursion;
public class find_occurrance {
    public static void check() {
    }
    public static void fun(  int idx, int key, int arr[]){
        if (idx == arr.length){
            return;
        }
        if (key == arr[idx]){
            System.out.print(idx);
        }
        fun(idx+1, key, arr);
    }
    public static void main(String[] args) {
    int arr[] ={3,2,4,5,6,2,7,2,2};
    int key = 2;
       fun(0,key,arr);
    }
}
