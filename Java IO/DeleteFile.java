import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("data.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted.");
            } else {
                System.out.println("Failed to delete.");
            }
        } else {
            System.out.println("File not found.");
        }
    }
}
