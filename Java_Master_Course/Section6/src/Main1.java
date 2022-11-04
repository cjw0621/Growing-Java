import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Welcome to Chase Bank");
        System.out.println("1) View balance " +
                "2) Make a deposit " +
                "3) Make a withdraw");
        while (true) {
            int input = user.nextInt();
            ChaseBank bank = new ChaseBank();
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
