package OOPS;

public class BasicOops {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Nitish Chauhan"; // Removed unnecessary parentheses
        // myAcc.password = "bjdfhf"; // This will give an error because 'password' is private
        
        // myAcc.setPassword("bjdfhf"); // Correct way to set the password using a method
    }
}

class BankAccount {
    public String username;
    // private String password;

    // public void setPassword(String pwd) { // Corrected method name (capitalization issue)
    //     password = pwd;
    // }
}
