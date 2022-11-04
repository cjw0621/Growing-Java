import java.util.Scanner;

public class ChaseBank {
    private String customerName;
    private int accountNumber;
    private int balance;
    private String email;
    private String phoneNumber;

    public ChaseBank(){
        this("Default firstName,", "Default LastName", 000_000_000,
                2,"No email", "000-000-0000" );
        System.out.println("Empty constructor called");
    }
    public ChaseBank(String firstName, String lastName, int accountNumber, int balance, String email, String phoneNumber){
        setCustomerName(firstName, lastName);
        setAccountNumber(accountNumber);
        setBalance(balance);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        System.out.println("Account constructor with parameters called");
    }

    private void setCustomerName(String firstName, String lastName){
        this.customerName = firstName + " " + lastName;
    }

    public String getCustomerName(){
        if(this.customerName.isBlank()) {
            return this.customerName = "Unknown";
        }
        return this.customerName;
    }

    private void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    private void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }

    private void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(String phoneNumber) {
        return this.phoneNumber;
    }

    public void depositFunds(int deposit){
        setBalance(getBalance() + deposit);
        System.out.println("New balance is: " + this.getBalance());
    }

    public void withdraw(int withdraw){
        if(getBalance() - withdraw < 0){
            System.out.println("Insufficient funds");
            System.out.println("Your current balance is: " + getBalance());
        } else {
            System.out.println("Current balance is: " + getBalance());
            setBalance(getBalance() - withdraw);
            System.out.println("New balance is: " + getBalance());
        }
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        ChaseBank bank = new ChaseBank();
//        ChaseBank bank = new ChaseBank("Chase", "Whitney", 556_221_867, 0,
//                "cjwhitney2892@gmail.com", "360-250-4332");

        System.out.println("Welcome to Chase Bank");

        while (true) {

            System.out.println("1) View balance " +
                    "2) Make a deposit " +
                    "3) Make a withdraw");
            int input = user.nextInt();

            if (input == 1) {
                System.out.println("Balance: " + bank.getBalance());
            } else if (input == 2) {
                System.out.println("Please enter an amount you want to deposit");
                input = user.nextInt();
                bank.depositFunds(input);
            } else if (input == 3) {
                System.out.println("Please enter the amount you want to withdraw");
                input = user.nextInt();
                bank.withdraw(input);

            }
        }
    }

}
