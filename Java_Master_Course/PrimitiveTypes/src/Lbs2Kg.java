import java.util.Scanner;

public class Lbs2Kg {

    public static void main(String[] args) {

        System.out.println("Enter your weight in pounds: ");

        Scanner input = new Scanner(System.in);

        int lbs = input.nextInt();
        double kg = lbs * 0.45359237;

        System.out.println(kg + " Kg");





    }
}
