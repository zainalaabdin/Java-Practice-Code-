import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterExample{
    public static void main(String arg[]) {
        try {
            PrintWriter writer = new PrintWriter("print_output.txt");

            writer.println("Hello from PrintWriter!");
            writer.println("This is line 2.");
            writer.println("Number: " + 100);

            writer.close();
            System.out.println("Data written successfully using PrintWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
