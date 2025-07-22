import java.io.File;
import java.io.IOException;

public class TempFileExample{
    public static void main(String arg[]){
        try{
            File tempFile = File.createTempFile("myTemp", ".txt");
            System.out.println("Temporary file create at :" + tempFile.getAbsolutePath());

            if(tempFile.exists()){
                System.out.println("Temporary file exixts");
            }

            tempFile.deleteOnExit();

        }catch(IOException e){
            System.out.println("An error occurred while creating temporary file.");
            e.printStackTrace();
        }
    }
}