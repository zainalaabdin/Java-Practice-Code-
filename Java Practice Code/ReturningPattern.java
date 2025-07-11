import java.util.Scanner;

class PatternPrint {
    static String pattern(int num) {
        String pattern = "";

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                pattern += "* ";
            }
            pattern += "\n"; 
        }

        return pattern;
    }
}

public class ReturningPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        int num = sc.nextInt();

        String pattern = PatternPrint.pattern(num);

        System.out.println(pattern);

        sc.close();
    }
}
