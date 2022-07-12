public class Spaces_Whitespaces_Indenting {

    public static void main(String[] args) {

        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test" + myVariable);

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50; myVariable--; //Not recommended putting everything on the same line
                                                // It's not as readable.
        System.out.println(anotherVariable);
    }
}
