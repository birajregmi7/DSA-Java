public class linear_search_using_string {
    public static int linearSearch(String[] values, String key){
        for (int i = 0; i < values.length ; i++) {
            if (values[i]== key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String values[] ={"momo","pizza","chat","panipuri","chole bature","samosa","aloo tikki"};
        String  key = "samosa";
        String index = String.valueOf(linearSearch(values,key));
        if (key.equals(-1)){
            System.out.println("It's invalid ");
        }else {
            System.out.println("The index of the input is"+" "+index);
        }
    }
}
