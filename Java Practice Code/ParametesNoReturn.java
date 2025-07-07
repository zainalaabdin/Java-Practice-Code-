import java.util.Scanner;

public class ParametesNoReturn{
    
    public static void pattern(int a){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    public static void Table(int a){
        for(int i = 1; i <= a; i++){
        System.out.println("Table of " + i);
        for(int j = 1; j <= 10; j++){
            System.out.println(i + " X " + j + " = " + (i * j));
        }
        System.out.println();

        }

    }

    public static void Prime(int num){
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

    public static void PrimeSeries(int num){
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
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ANY NUMBER FOR PATTERN: ");
        int pat = sc.nextInt();
        pattern(pat);

        System.out.print("Enter number for tables: ");
        int tab = sc.nextInt();
        Table(tab);

        System.out.print("Enter number to check prime: ");
        int prime = sc.nextInt();
        Prime(prime);

        System.out.print("Enter number for prime series: ");
        int pseries = sc.nextInt();
        PrimeSeries(pseries);

    }
    
}
