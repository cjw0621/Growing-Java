public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(50,100));


    }

    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 < 10) || (num2 < 10) || (num1 > 99) || (num2 > 99)){
            return false;
        }
        int num1First = num1 / 10;
        int num1Second = num1 % 10;
        int num2First = num2 / 10;
        int num2Second = num2 % 10;

        return (num1First == num2First) || (num1First == num2Second) ||
                (num1Second == num2First) || (num1Second == num2Second);

    }

}
