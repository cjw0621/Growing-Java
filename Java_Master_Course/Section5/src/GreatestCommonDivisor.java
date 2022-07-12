public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int a, int b){
        int endNumber;
        int gcd = 1;
        if((a<10) || (b<10)){
            return -1;
        }
        endNumber = Math.max(a, b);

        for(int i = 1; i<=endNumber; i++){
            if((a%i==0)&&(b%i==0)) {
                gcd = i;
            }
        } return gcd;
    }
}
