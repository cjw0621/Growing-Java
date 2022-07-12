import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        boolean x = true;
        while(x) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Type a number to find that nth prime.");
            System.out.println("Type close to close the app.");
            String primeNumber = sc.nextLine();
            if(primeNumber.equals("close")){
                x = false;

            } else {foundPrime(Integer.parseInt(primeNumber));
                System.out.println("****************************************");}
        }
    }


        public static void foundPrime( int x){

            int count = 0;
            for (int i = 2; i <= (500_000_000); i++) {
                if (isPrime(i)) {
                    count++;
                    ;
                    if (count == x) {
                        System.out.println("The prime number in the " + count  +

                                " place is: " + i);
                        break;
                    }
                }
            }
        }


        public static boolean isPrime ( int n){

            if (n == 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }return true;
    }
}
