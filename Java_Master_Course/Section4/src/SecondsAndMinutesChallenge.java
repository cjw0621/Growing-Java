public class SecondsAndMinutesChallenge {

    /// The "final" keyword makes the value (INVALID_VALUE_MESSAGE)
    /// A constant is a variable that can't be changed.
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)) {

            int hrs = minutes / 60;
            int remMin = minutes % 60;

            String hoursString = hrs + "h ";
            if(hrs < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remMin + "m ";
            if(remMin < 10) {
                minutesString = "0" + minutesString;
            }

            String secondString = seconds + "s";
            if(seconds < 10) {
                secondString = "0" + secondString;
            }

            return hoursString + minutesString + secondString;
        }return INVALID_VALUE_MESSAGE;

    }
    public static String getDurationString(int seconds) {
        if(seconds >= 0) {
            int min = seconds / 60;
            int remSec = seconds % 60;
            return getDurationString(min, remSec);
        } return INVALID_VALUE_MESSAGE;
    }
}
