import java.util.Scanner;

public class CalculatorClass{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        MyCalculator cal = new MyCalculator();
        System.out.print("Enter first Number :");
        cal.num1 = sc.nextInt();

        System.out.print("Enter 2nd Number :");
        cal.num2 = sc.nextInt();

        System.out.print(cal);
    }
}

    class MyCalculator{

        int num1;
        int num2;

        public String toString(){
            int sum = num1 + num2;
            int sub = num1 - num2;

            return " ADDTION :" + sum + " SUBSTRACTION :" + sub;
        }
    }