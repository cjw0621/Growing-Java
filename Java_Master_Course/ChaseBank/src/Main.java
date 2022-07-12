import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        double checkingAccount = 300.00d;
        double savingsAccount = 300.00d;
        boolean programStart = true;
        double atmFee = 3.00d;

        System.out.println("Welcome to Chase Bank!");
        TimeUnit.SECONDS.sleep(2);

        System.out.println("Enter Pin: ");
        String enterPin = sc.next();

            if (Objects.equals(enterPin, "1927")) {

                TimeUnit.SECONDS.sleep(1);
                System.out.println("** Login Successful **");
                System.out.println("------------------------");
                TimeUnit.SECONDS.sleep(1);
                while (programStart) {
                    System.out.println("Press (1): to view Checking Account");
                    System.out.println("Press (2): to view Savings Account");
                    System.out.println("Press (3): to make a Deposit");
                    System.out.println("Press (4): to make a Withdrawal");
                    System.out.println("Press (0): to EXIT");
                    double userInput = sc.nextInt();

                        if (userInput == 1) {
                            System.out.println("------------------------");
                            System.out.println("Checking: $ " + String.format("%.02f", checkingAccount));
                            System.out.println("------------------------");
                            TimeUnit.SECONDS.sleep(1);
                        } else if (userInput == 2) {
                            System.out.println("------------------------");
                            System.out.println("Savings: $ " + String.format("%.02f", savingsAccount));
                            System.out.println("------------------------");
                            TimeUnit.SECONDS.sleep(1);
                        } else if (userInput == 3) {
                            System.out.println("Press (1): to deposit into Checking");
                            System.out.println("Press (2): to deposit into Saving");
                            userInput = sc.nextInt();

                            if (userInput == 1) {
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("Enter deposit amount");
                                userInput = sc.nextInt();
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("Deposit Successful");
                                checkingAccount += userInput;
                            } else if (userInput == 2) {
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("Enter deposit amount");
                                userInput = sc.nextInt();
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("Deposit Successful");
                                savingsAccount += userInput;
                            }
                        } else if (userInput == 4) {
                            System.out.println("Press (1): to Withdrawal from Checking");
                            System.out.println("Press (2): to Withdrawal from Savings");
                            userInput = sc.nextInt();

                            if (userInput == 1) {
                                System.out.println("There is a $3.00 fee for this Withdrawal");
                                System.out.println("Do you accept?");
                                String userInputS = sc.next();

                                while (Objects.equals(userInputS, "y") || Objects.equals(userInputS, "yes")) {
                                    System.out.println("Enter Withdrawal amount in increments of $20.00.");
                                    userInput = sc.nextInt();
                                    TimeUnit.SECONDS.sleep(2);

                                    if (userInput % 20 == 0) {
                                        if (checkingAccount - (userInput + atmFee) < 0) {
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("Insufficient funds.");
                                            System.out.println("------------------------");
                                            System.out.println("Please check your Withdrawal amount and try again");
                                            System.out.println("-------------------------------------------------");
                                            TimeUnit.SECONDS.sleep(2);
                                            break;
                                        } else {
                                            checkingAccount -= (userInput + atmFee);
                                            System.out.println("Please retrieve your money below");
                                            System.out.println("---------------------------------");
                                            TimeUnit.SECONDS.sleep(2);
                                            break;
                                        }
                                    } else {
                                        System.out.println("Invalid amount: Please check your amount and try again.");
                                        System.out.println("------------------------");
                                    }
                                }
                            } else if (userInput == 2) {
                                System.out.println("There is a $3.00 fee for this Withdrawal");
                                System.out.println("Do you accept?");
                                String userInputS = sc.next();

                                while (Objects.equals(userInputS, "y") || Objects.equals(userInputS, "yes")) {
                                    System.out.println("Enter Withdrawal amount in increments of $20.00.");
                                    userInput = sc.nextInt();
                                    TimeUnit.SECONDS.sleep(2);

                                    if (userInput % 20 == 0) {
                                        if (savingsAccount - (userInput + atmFee) < 0) {
                                            System.out.println("Insufficient funds.");
                                            System.out.println("Please check your Withdrawal amount and try again");
                                            TimeUnit.SECONDS.sleep(2);
                                            break;
                                        } else {
                                            savingsAccount -= (userInput + atmFee);
                                            System.out.println("Please retrieve your money below");
                                            TimeUnit.SECONDS.sleep(2);
                                            break;
                                        }

                                    } else {
                                        System.out.println("Invalid amount: Please check your amount and try again");
                                    }
                                }
                            }
                        } else if (userInput == 0) {
                            System.out.println("Thank you for your business");
                            programStart = false;
                            sc.close();
                        }
                }
            } else {
                System.out.println("** Invalid PIN **");
        }
    }
}