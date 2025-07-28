import java.util.Scanner;

public class Pattern {
    public void pattern(){

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a Number :");
    int a = sc.nextInt();

    for(int i = 1; i <= a; i++){
        System.out.println("Table of " + i);
        for(int j = 1; j <= 10; j++){
            System.out.println(i + " X " + j + " = " + (i * j));
        }
        System.out.println();

    }
    sc.close();
    }
    
    public static void main(String[] arg){
        pattern();
        
    }
}

