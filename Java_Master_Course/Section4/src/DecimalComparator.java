public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
    public static boolean areEqualByThreeDecimalPlaces(double param1,
                                                    double param2) {
        int fNum = (int) (param1 * 1000);
        int sNum = (int) (param2 * 1000);
        return fNum - sNum == 0;
    }
}
