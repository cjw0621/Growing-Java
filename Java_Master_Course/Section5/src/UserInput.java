import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = sc.hasNextInt();

        if(hasNextInt) {

            int yearOfBirth = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            int age = 2022 - yearOfBirth;

            if (age < 0 || age > 100) {
                System.out.println("Invalid year of birth.");
            } else {
                System.out.println("Your name is " + name + ", and you are about " + age + " years old.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        sc.close();
    }
}
