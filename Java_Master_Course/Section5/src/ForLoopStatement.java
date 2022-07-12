public class ForLoopStatement {

    public static void main(String[] args) throws InterruptedException {
        ///init: means the code that will be initialized once at the start of
        // the loop

        ///termination: tells the for loop how we want to exit the loop, or
        // at what point do we exit, once this evaluates to false the loop
        // will exit.

        ///increment: The expression that's invoked after each iteration of
        // the loop. A common thing to put in here is a number that
        // increments each time the loop goes around, sort of like a count.

        ///for (init; termination; increment) {}

//        for(int i=0; i<=5; i++ ){
//            Thread.sleep(2000);
//            switch(i){
//                case 0 -> System.out.println("The start of the loop");
//                case 1 -> System.out.println("The First iteration");
//                case 2 -> System.out.println("The Second iteration");
//                case 3 -> System.out.println("The Third iteration");
//                case 4 -> System.out.println("The Fourth iteration");
//                case 5 -> System.out.println("The last iteration");
//            }
//        }

        for(int i=2; i<=8; i++){
            ///Use the printf() method with %.2f%n to keep the decimal place 2.
            System.out.printf("%.2f%n", calculateInterest(10000, i));
        }

        System.out.println(" ");

        for(int i=8; i>=2; i--){
            System.out.printf("%.2f%n", calculateInterest(10000, i));
        }
    }



    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }
        for(int i=2; i<=n/2; i++){
            System.out.println("looping "+i);
            if(n % i == 0) {
                return false;
            }
        } return true;
    }



    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
