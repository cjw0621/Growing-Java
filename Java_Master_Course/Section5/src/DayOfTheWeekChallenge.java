package Section5.src;

import java.util.Scanner;

public class DayOfTheWeekChallenge {
    private static final String ERROR_MESSAGE_VALUE = "Invalid day";

    public static void main(String[] args) {

        System.out.println("Enter a number 0 - 6:");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        printDayOfTheWeek(userInput);

    }
    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println(ERROR_MESSAGE_VALUE);

        }
    }

}
