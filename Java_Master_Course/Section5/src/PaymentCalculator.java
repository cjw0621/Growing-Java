import java.util.Scanner;

public class PaymentCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int totalPayment = 0;
        int varAmount = amount;
        for(int i=1; i<=3; i++){
            int payment = (int) (varAmount * (.10));
            varAmount -= payment;
            totalPayment += payment;
        }
        System.out.println(amount - totalPayment);
    }
}
