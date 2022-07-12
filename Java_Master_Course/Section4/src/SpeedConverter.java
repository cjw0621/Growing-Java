public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(-5.6);
        printConversion(1.5);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round((double) kilometersPerHour / 1.609);
    }

    public static void printConversion(double x) {
        if (toMilesPerHour(x) == -1) {
            System.out.println("Invalid Value");
            } else {
                long y = toMilesPerHour(x);
                System.out.println(x +" km/h" + " = " + y + " mi/h");
        }
    }
}

