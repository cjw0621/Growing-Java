public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int a) {
        int reverse = 0;
        int aVar = a;

        while (aVar != 0) {
            int lastDigit = aVar % 10;
            reverse *= 10;
            reverse += lastDigit;
            aVar /= 10;

        } if(a == reverse){
            return true;
        }return false;
    }

}
