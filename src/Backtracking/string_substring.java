package Backtracking;

public class string_substring {
    public static void main(String[] args) {
        String str = "abc";
        for (int i = 0; i <str.length() ; i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0,i);
            String newStr2 = str.substring(i+1);
            System.out.println(newStr + "1");
            System.out.println(newStr2 + "2");
        }
    }
}
