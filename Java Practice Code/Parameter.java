import java.util.Scanner;

public class Parameter{
    public static void pattern(int a){
        for(int i = 1; i <= a; i++){
            System.out.println("Table of " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();

        }
    }
     public static void pattern(int a, int b){
        for(int i = 1; i <= a; i++){
            System.out.println("Table of " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();

        }
    }
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        pattern(num);
    } 
    
}
