package String;
public class string_compression_using_stringbuiler {
    public static String compress(String str) {
        StringBuilder newString1 = new StringBuilder("");
//        String newStr ="";
        for (int i = 0; i <str.length() ; i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
//            newStr += str.charAt(i);
            newString1.append(str.charAt(i));
            if (count>1){
//                newStr += count.toString();
//                newString1.append(count.toString());
                newString1.append(count);
            }
        }
//        return newStr;
        return newString1.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
