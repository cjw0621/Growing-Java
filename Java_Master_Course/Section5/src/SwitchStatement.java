import java.util.Locale;
import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value = 3;
        if(value == 1){
            System.out.println("Value was 1");
        } else if(value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 5;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("was a 3, or 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1 or 2");
        }


        // More code here
        // A char character MUST BE in single quotes like below
        System.out.println("Input a single character: ");

        // The code below scans for a char value from a user input and
        //uses a switch / case to output the value to the user.
        char myChar = sc.next().charAt(0);
        switch (myChar) {
            // The "->" symbol is the "return" symbol
            case 'A' -> System.out.println("Value was A");
            case 'B' -> System.out.println("Value was B");
            case 'C' -> System.out.println("Value was c");
            case 'D' -> System.out.println("Value was D");
            case 'E' -> System.out.println("Value was E");
            default -> {
                System.out.println("Error: 404" + myChar + " was not " +
                        "found");

                }
            }

        System.out.println("Enter a month: ");
        String month = sc.next().toLowerCase(Locale.ROOT);

        switch(month) {

            case "january", "jan" -> System.out.println("January was selected");
            case "february", "feb" -> System.out.println("February was " +
                    "selected");
            case "march", "mar" -> System.out.println("March was selected");
            case "april", "apr" -> System.out.println("April was selected");
            case "may" -> System.out.println("May was selected");
            case "june", "jun" -> System.out.println("June was selected");
            case "july", "jul" -> System.out.println("July was selected");
            case "august", "aug" -> System.out.println("August was selected");
            case "september", "sep" -> System.out.println("September was " +
                    "selected");
            case "october", "oct" -> System.out.println("October was selected");
            case "november", "nov" -> System.out.println("November was " +
                    "slected");
            case "december", "dec" -> System.out.println("December was " +
                    "selected");
            default -> System.out.println("Error 404: Month was not found");

        }

    }



}
