import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors


public class FileWriter {

    public static void main(String[] args) {
        try {
            // creates a file inside the documents folder
            File save_file = new File("saveFile.txt");
            if (save_file.createNewFile()){
                System.out.println("File created: " + save_file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}
