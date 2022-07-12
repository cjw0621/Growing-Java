// Java Program to illustrate Reading from FileReader
// using BufferedReader Class

// Importing input output classes
import java.io.*;

// Main class
public class ReadFiles {

    // Main driver method
    public static void main(String[] args) throws Exception {

        // File path is passed as parameter
        File file = new File("saveFile.txt");

        // Note: Double back-quote is to avoid compiler interpret words like \test as \t (ie as an escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till there is character in a string
        while ((st = br.readLine()) != null){
            var words = st;

            if(words.contains("nuke")){
                System.out.println(st);
            } else {
                System.out.println("Nothing to read");
            }
        }

    }
}
