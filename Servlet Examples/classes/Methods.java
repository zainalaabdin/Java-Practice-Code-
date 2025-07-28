import java.util.Scanner;

public class Methods{
    public static void pattern(int a){
       System.out.println(a);
    }
     public static void pattern(int a, int b){
        System.out.println(a+b);
    }

    public static void pattern(double a, double b){
        System.out.println(a*b);
    }

     public static void pattern(float a){
        int total = 200*100/300;
        System.out.println(total);
    }
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for Number Print :");
        int num = sc.nextInt();

        System.out.print("Enter a Number for Addtion :");
        int num2 = sc.nextInt();

        System.out.print("Enter a Number for Multiplication :");
        double num3 = sc.nextInt();

        System.out.print("Enter a Number for Persantage :");
        float num4 = sc.nextInt();
        
        pattern(num);
        pattern(num2, num2);
        pattern(num3, num3);
        pattern(num4);
    } 
    
}
