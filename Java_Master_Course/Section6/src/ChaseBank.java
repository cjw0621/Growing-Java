import java.util.Scanner;

public class ChaseBank {
    private String customerName;
    private int accountNumber;
    private int balance;
    private String email;
    private String phoneNumber;

    public void setCustomerName(String firstName, String lastName){
        this.customerName = firstName + " " + lastName;
    }

    public String getCustomerName(){
        if(this.customerName.isBlank()) {
            return this.customerName = "Unknown";
        }
        return this.customerName;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(int balance){
        this.balance = this.balance + balance;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(String phoneNumber) {
        return this.phoneNumber;
    }

    public void depositFunds(int deposit){
        setBalance(deposit);
        System.out.println("New balance is: " + this.getBalance());
    }

    public void withdraw(int withdraw){
        if(this.getBalance() - withdraw < 0){
            System.out.println("Insufficient funds");
            System.out.println("Your current balance is: " + this.getBalance());
        } else {
            System.out.println("Current balance is: " + this.getBalance());
            setBalance(this.getBalance()-withdraw);
            System.out.println("New balance is: " + this.getBalance());
        }
    }

}
