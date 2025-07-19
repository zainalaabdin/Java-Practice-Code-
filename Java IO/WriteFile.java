
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile{
    public static void main(String arg[]){
        try{
            FileWriter Writer = new FileWriter("data.txt");
            Writer.write("This line wrriten to the new File");
            Writer.close();
            System.out.println("Successfully written to file");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}