import java.io.File;

public class CompairFileExample{
    public static void main(String arg[]){
        File file1 = new File("Afile.txt");
        File file2 = new File("Bfile.txt");

        int result = file1.compareTo(file2);

        if(result == 0){
            System.out.println("Both file names are equal");
        }else if(result < 0){
            System.out.println(file1.getName() + " Comes before " + file2.getName());
        }else{
            System.out.println(file1.getName() + " Comes After " + file2.getName());
        }
    }
}