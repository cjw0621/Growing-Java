import java.sql.SQLOutput;

public class Char_Boolean {
    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicode);
        /* find code at unicode-table.com*/
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
