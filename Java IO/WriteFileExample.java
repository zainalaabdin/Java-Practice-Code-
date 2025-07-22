import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample{
    public static void main(String arg[]){
        try{
            FileWriter writer = new FileWriter("output.txt");
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.write("This is he first line");
            buffer.newLine();
            buffer.write("This is Second Line");
            buffer.newLine();
            buffer.write("This is Third Line");

            buffer.close();
            System.out.println("Data written to file successfully.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}