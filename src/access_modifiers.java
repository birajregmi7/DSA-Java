public class access_modifiers {
    public static void main(String[] args) {
    BankAccount myAcc = new BankAccount();
    myAcc.username="Biraj";
    myAcc.password ="helloworld123";
        System.out.println(myAcc.password);
    myAcc.setPassword("helloworld123"); // in line 6 and 7 we use function in function the access modifier is public so we can use but if we dont use function and directly try to access password then it won't let because it is private
        System.out.println(myAcc.password);
    }
    static class BankAccount{
        public String username;
       private String password;

      public void setPassword(String newPassword){
           password = newPassword;
       }
    }
}
