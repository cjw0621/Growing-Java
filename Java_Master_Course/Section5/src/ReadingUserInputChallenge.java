import java.util.Scanner;

public class ReadingUserInputChallenge {
// Read 10 numbers form the console entered by the user and print the sume of those numbers.
// Create a Scanner like we did in the previous video.
// use the hasNextInt() method from the scanner to check if the user has entered an Int value.
// If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
// Use the nextInt() method to get the number and add it to the sum.
// Before the user enters each number, print the message "Enter number #x:" where x represents the count, i.e. 1, 2, 3, 4, etc.
// For example, the first message printed to the user would be "Enter number #1:", the next "Enter number #2:", and so on.
// Hint:
    // Use a while loop.
    // Use a counter variable for counting valid numbers.
    // Close the scanner after you don't need it anymore.
    // Create a project with the name ReadingUserInputChallenge.
    public static void main(String[] args) {

        int sumOfNum = 0;
        int counter = 0;
        while(true) {
            System.out.println("Enter number #" + (counter + 1) +":");
            Scanner sc = new Scanner(System.in);
            if(!sc.hasNextInt()) {
                System.out.println("Invalid Number");
            } else {
                int x = sc.nextInt();
                sumOfNum += x;
                counter += 1;
                if (counter == 10) {
                    System.out.println(sumOfNum);
                    sc.close();
                    break;
                }
            }
        }

    }
}
