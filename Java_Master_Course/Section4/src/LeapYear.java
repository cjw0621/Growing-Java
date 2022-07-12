public class LeapYear {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1856));
    }

    public static boolean isLeapYear(int year) {
        if (year > 1 && year < 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } return true;
            }return false;
        }return false;
    }
}
