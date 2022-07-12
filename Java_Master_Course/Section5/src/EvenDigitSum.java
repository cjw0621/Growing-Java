public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(246824688));
    }
    public static int getEvenDigitSum(int number){
        int sumEven = 0;
        if(number < 0){
            return -1;
        }
        while(number != 0){
            int checkEven = number % 10;
            number /= 10;
            if(checkEven % 2 == 0){
                sumEven += checkEven;
            }

        } return sumEven;
    }
}
