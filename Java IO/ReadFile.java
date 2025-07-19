import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String arg[]) {
        try {
            FileReader reader = new FileReader("data.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
