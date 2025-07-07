
import java.util.Scanner;

public class MarksheetPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in English: ");
        int english = sc.nextInt();

        System.out.print("Enter marks in Math: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();

        int total = english + math + science;
        float percentage = total * 100 / 300;

        System.out.println("Total Marks: " + total + "/300");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 60) {
            System.out.println("Result: Pass with First Division");
        } else if (percentage >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
