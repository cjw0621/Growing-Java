public class SumOfFirstAndLast {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int num){
        if(num < 0){
            return -1;
        }
        int lastDigit = num % 10;
        int firstDigit = 0;

        while(num != 0){
            firstDigit = num;
            num/=10;
        }
        return lastDigit + firstDigit;
    }
}
