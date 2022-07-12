public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(10,98,887));

    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        boolean num1B = isValid(num1);
        boolean num2B = isValid(num2);
        boolean num3B = isValid(num3);

        if (!(num1B && num2B && num3B)) {
            return false;
        }
        int num1M = num1 % 10;
        int num2M = num2 % 10;
        int num3M = num3 % 10;

        if ((num1M == num2M) || (num1M == num3M)) {
            return true;
        } return num2M == num3M;
    }

    public static boolean isValid(int num){
        return num >=10 && num <= 1000;
    }
}
