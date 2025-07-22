import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample{
    public static void main(String arg[]){
        try{
            File file = new File("myfile.txt");
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("WELCOME TO NEW FILE");
            writer.close();
            System.out.println("Successfully wrote to the file.");

        }catch(IOException e){
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}