import java.util.Scanner;

public class NoparaNoReturnExample{
    public static void pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER FOR PATTERN: ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    public static void Table(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER FOR TABLE :");
        int a = sc.nextInt();

        for(int i = 1; i <= a; i++){
        System.out.println("Table of " + i);
        for(int j = 1; j <= 10; j++){
            System.out.println(i + " X " + j + " = " + (i * j));
        }
        System.out.println();

        }

    }

    public static void Prime(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int a = 2; a < num; a++) {
            if (num % a == 0) {
                isPrime = false;
                break;
            }
        }

        if (num <= 1) {
            System.out.println("Not Prime: " + num);
        } else if (isPrime) {
            System.out.println("Prime: " + num);
        } else {
            System.out.println("Not Prime: " + num);
        }
    }

    public static void PrimeSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int Prime = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    Prime++;
                }
            }
            if (Prime == 2) {
                System.out.print(i + " ");
            }   
        }
    }
    
    public static void main(String arg[]){
        
        pattern();
        Table();
        Prime();
        PrimeSeries();
    }
    
}
