import java.io.File;

public class CanReadExample {
    public static void main(String arg[]) {
        File file = new File("data.txt");

        if (file.exists()) {
            if (file.canRead()) {
                System.out.println("This file is readable.");
            } else {
                System.out.println("This file is NOT readable.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
