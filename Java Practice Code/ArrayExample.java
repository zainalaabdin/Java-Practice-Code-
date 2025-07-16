import java.util.Scanner;

public class ArrayExample {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for(int a = arr.length-1; a >= 0; a--){
            System.out.print("Enter the number on loccation " +a+ ":");
            arr[a] = sc.nextInt();
            System.out.println();

        }

        for(int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);

        }

    }    
}
