import java.util.Scanner;

public class SumOddChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your first number? ");
        int firstNum = sc.nextInt();
        System.out.println("Whats your second number? ");
        int secondNum = sc.nextInt();

        int sumOfOdd = sumOdd(firstNum, secondNum);

        System.out.println("The sum of all odd numbers between " + firstNum +
                " and " + secondNum + " = " + sumOfOdd);

    }

    public static boolean isOdd(int n){
        if(n>0) {
            if (n % 2 != 0) {
                return true;
            } return false;
        } return false;
    }

    public static int sumOdd(int a, int b) {
        int sum = 0;
        if((a <= b) && (a>0 && b>0)) {
            for (int i = a; i <= b; i++) {
                if (isOdd(i)) {
                    sum += i;
                }

            }
            return sum;
        } else {
            return -1;
        }
    }

}
