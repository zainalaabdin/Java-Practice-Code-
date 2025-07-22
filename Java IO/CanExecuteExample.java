import java.io.File;

public class CanExecuteExample {
    public static void main(String[] args) {
        File file = new File("example.bat");

        if (file.exists()) {
            if (file.canExecute()) {
                System.out.println("This file is executable.");
            } else {
                System.out.println("This file is NOT executable.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
