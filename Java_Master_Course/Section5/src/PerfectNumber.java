public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int num)  {
        if(num < 1){
            return false;
        }
        int sumDivisor = 0;
        for(int i = 1; i<num; i++) {
            if(num%i==0){
                sumDivisor+=i;
            }
        } return sumDivisor == num;
    }
}
