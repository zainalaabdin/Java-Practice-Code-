import java.util.Scanner;

public class Table {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for Table :");
        int num = sc.nextInt();
        for(int a = 1; a <= 10; a++){
            System.out.print(num + "X"+ a + " = " + num*a);
            System.out.println();
        }
        sc.close();
    }
}
