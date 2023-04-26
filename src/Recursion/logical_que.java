package Recursion;

public class logical_que {
    public static int fun(int n){
        int v = 0;
        if (n>=5){
            return 1;
        }
        v = n;
        return fun(n+1) +v;
    }
    public static void main(String[] args) {
        System.out.println(fun(1));
        return ;
    }
}
