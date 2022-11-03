import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        Scanner input = new Scanner(System.in);
        int xx = 0;
        long yy;
        int counter = 0;

        while (input.hasNextInt()) {

            int num = input.nextInt();
            xx += num;
            counter++;

        }

        double avg  =  (float) xx / counter;

        yy = Math.round(avg);

        System.out.println("SUM = " + xx + " AVG = " + yy);

    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

}
