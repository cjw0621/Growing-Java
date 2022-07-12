public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {

        long yrs = ((minutes / 60) / 24)/365;
        long days = ((minutes / 60) / 24) % 365;

        System.out.println(minutes + " min" + " = " + yrs + " y" + " and " + days + " d");

        }

    }
}