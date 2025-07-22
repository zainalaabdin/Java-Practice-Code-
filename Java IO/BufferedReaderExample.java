import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample{
    public static void main(String arg[]){
        try{
            FileReader fileReader = new FileReader("data.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
        
        }catch(IOException e){
            System.out.println("File read error: " + e.getMessage());
        }
    }
}