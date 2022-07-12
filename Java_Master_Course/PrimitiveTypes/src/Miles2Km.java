import java.util.Scanner;

public class Miles2Km {
    public static void main(String[] args){
        System.out.println("Enter a number in miles: ");

        Scanner input = new Scanner(System.in);

        int miles = input.nextInt();
        double km = miles * 1.60934;

        System.out.println(km + "Km");

        System.out.println("Enter a number in km: ");

        Scanner input1 = new Scanner(System.in);

        int km1 = input1.nextInt();
        double miles1 = km1 / 1.60934;

        System.out.println(miles1 + " Miles");
    }
}
