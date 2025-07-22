import java.io.File;

public class CanWriteExample {
    public static void main(String arg[]) {
        File file = new File("data.txt");

        if (file.exists()) {
            if (file.canWrite()) {
                System.out.println("This file is writable.");
            } else {
                System.out.println("This file is NOT writable.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
