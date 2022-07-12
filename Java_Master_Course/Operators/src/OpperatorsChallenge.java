public class OpperatorsChallenge {
    public static void main(String[] args){
        double firstVar = 20.00d;
        double secondVar = 80.00d;

        double result = (firstVar + secondVar) * 100.00d;

        double newResult = result % 40.00d;

        // ternary operator
        // "boolean isNoRemainder = (newResult == 0) ? true : false;"
        // below is simplified version of
        boolean isNoRemainder = newResult == 0;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }

}
