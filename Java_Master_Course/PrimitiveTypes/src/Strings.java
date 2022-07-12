public class Strings {
    public static void main(String[] args) {

        //  byte: May never use
        //  short: May never use
        //  int: Most common
        //  long: May use from time to time
        //  float: May never use
        //  double: Most common
        //  char: May use from time to time
        //  boolean: Most common

        String myString = "This is a string";
        System.out.println("My string is = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is = " + myString);

        //Use this method below to append strings to one another.
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

        //When checking the data type of lastString, java outputed java.lang.string
        //So no matter what data type you append to the string, java will
        //convert the Type into a string.
        System.out.println(lastString.getClass().getName());




    }
}
