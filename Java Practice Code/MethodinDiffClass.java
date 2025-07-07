import java.util.Scanner;

public class MethodinDiffClass{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        PatternClass obj = new PatternClass();
        TableClass obj2 = new TableClass();
        PrimeClass obj3 = new PrimeClass();
        PrimeSeriesClass obj4 = new PrimeSeriesClass();


        System.out.print("Enter number for pattern: ");
        int pat = sc.nextInt();
        String output = obj.pattern(pat);
        System.out.println(output);

        System.out.print("Enter any Number for Table: ");
        int tab = sc.nextInt();
        String Toutput = obj2.table(tab);
        System.out.print(Toutput);

        System.out.print("Enter any Number to check Prime: ");
        int prime = sc.nextInt();
        String Poutput = obj3.prime(prime);
        System.out.println(Poutput);

        System.out.print("Enter any Number for Prime Series: ");
        int pseries = sc.nextInt();
        String PSoutput = obj4.primeSeries(pseries);
        System.out.println(PSoutput);

    }
}

    class PatternClass {
    public String pattern(int num) {
        String out = "";
        for (int a = 1; a <= num; a++) {
            for (int b = 1; b <= a; b++) {
                out += "* ";
            }
        out += "\n";
        }
        return out;
    }
}

    
    class TableClass {
    public String table(int num) {
        String out = "";
        for (int i = 1; i <= 10; i++) {
        out += num + " x " + i + " = " + (num * i) + "\n";
        }
        return out;
    }
}


    class PrimeClass {
    public String prime(int num) {
        if (num <= 1) {
            return num + " is not a Prime number.";
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
            return num + " is not a Prime number.";
            }
        }
            return num + " is a Prime number.";
    }
}


    class PrimeSeriesClass {
    public String primeSeries(int num) {
        String out = "";
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                isPrime = false;
                break;
                }
            }
            if (isPrime) {
                out += i + " ";
            }
        }
        return out;
    }
}
