package Recursion;

public class binary_string_problem_code {
    public static void binprob(int n , int lastPlace, String str){
        if (n==0){
            System.out.println(str);
            return;
        }
        binprob(n-1,0,str+"0");
        if (lastPlace == 0){
            binprob(n-1,1,str+"1");
        }

    }
    public static void main(String[] args) {
        binprob(3,0,"");
    }
}
