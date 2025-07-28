import java.util.Scanner;

public class WithParameterAndReturn {

    public static String pattern(int a) {
        String out = "";
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                out += "* ";
            }
            out += "\n";
        }
        return out;
    }

    public static String Table(int a) {
        String out = "";
        for (int i = 1; i <= a; i++) {
            out += "Table of " + i + ":\n";
            for (int j = 1; j <= 10; j++) {
                out += i + " X " + j + " = " + (i * j) + "\n";
            }
            out += "\n";
        }
        return out;
    }

    public static String Prime(int num) {
        boolean isPrime = true;

        for (int a = 2; a < num; a++) {
            if (num % a == 0) {
                isPrime = false;
                break;
            }
        }

        if (num <= 1) {
            return num + " is Not Prime";
        } else if (isPrime) {
            return num + " is Prime";
        } else {
            return num + " is Not Prime";
        }
    }

    public static String PrimeSeries(int num) {
        String out = "";
        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                out += i + " ";
            }
        }
        return out;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for pattern: ");
        int pat = sc.nextInt();
        System.out.println(pattern(pat));

        System.out.print("Enter number for tables: ");
        int tab = sc.nextInt();
        System.out.println(Table(tab));

        System.out.print("Enter number to check prime: ");
        int prime = sc.nextInt();
        System.out.println(Prime(prime));

        System.out.print("Enter number for prime series: ");
        int pseries = sc.nextInt();
        System.out.println(PrimeSeries(pseries));
    }
}
