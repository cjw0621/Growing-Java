public class IntEqualityPrinter {

    private static final String ERROR_MESSAGE_VALUE = "Invalid Value";

     public static void main(String[] args) {

        printEqual(1, 1, 3);
        
    }

    public static void printEqual(int para1, int para2, int para3) {

        if (para1 < 0 || para2 < 0 || para3 < 0){
            System.out.println(ERROR_MESSAGE_VALUE);
        } else {

            if (para1 == para2 && para1 == para3) {
                System.out.println("All numbers are equal");
            } else if (para1 != para2 && para2 != para3 && para1 != para3) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }

    }
    
}