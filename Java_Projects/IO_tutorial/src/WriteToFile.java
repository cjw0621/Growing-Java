import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class WriteToFile {
    public static void main(String[] args) {
       try {
           FileWriter myWriter = new FileWriter("saveFile.txt");
           myWriter.write("This is an example of writing to a file");
           myWriter.close();
           System.out.println("Successfully wrote to the file.");
       } catch (IOException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();
       }
    }
}
