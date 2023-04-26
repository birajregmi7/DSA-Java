package String;

public class charAt_method {
    public static void printt(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        printt("Sujal is laude");
    }
}
