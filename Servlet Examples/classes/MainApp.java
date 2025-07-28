import java.util.*;

class MarksheetPrint extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ENGLISH MARKS : ");
        int english = sc.nextInt();

        System.out.print("ENTER MATH MARKS : ");
        int math = sc.nextInt();

        System.out.print("ENTER SCIENCE MARKS : ");
        int science = sc.nextInt();

        int total = english + math + science;
        double per = (total * 100.0) / 300;

        String grade;
        if (per >= 80)
            grade = "A+";
        else if (per >= 70)
            grade = "A";
        else if (per >= 60)
            grade = "B";
        else if (per >= 50)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("English    : " + english);
        System.out.println("Math       : " + math);
        System.out.println("Science    : " + science);
        System.out.println("Total      : " + total + " / 300");
        System.out.printf("Percentage : %.2f%%\n", per);
        System.out.println("Grade      : " + grade);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MainApp {
    public static void main(String[] args) {
        MarksheetPrint mThread = new MarksheetPrint();
        mThread.start();
    }
}
