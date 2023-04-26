package Backtracking;

public class string_subsets_problem {
    public static void findingSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
                return;
            }
            findingSubsets(str, ans + str.charAt(i), i + 1);
            findingSubsets(str, ans, i + 1);
        }

    public static void main(String[] args) {
        String str="abc";
        findingSubsets(str,"", 0 );
    }
}
