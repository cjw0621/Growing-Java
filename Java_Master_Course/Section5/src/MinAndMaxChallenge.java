import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        boolean first = true;

        System.out.println("Input a number: ");

        while(input.hasNextInt()){

            System.out.println("Input a number: ");

            int num = input.nextInt();

//            //ensures that the user input is stored in variables
//            if(first) {
//                first = false;
//                min = num;
//                max = num;
//            }

            if(num > max){
                max = num;
            }

            if(num < min) {
                min = num;
            }

        }

        System.out.println("Max number is: " + max);
        System.out.println("Minimum number is: " + min);

        input.close();
    }
}
