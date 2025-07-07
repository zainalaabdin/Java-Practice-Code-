import java.util.Scanner;
public class StarPrint{

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ANY NUMBER :");
        int num = sc.nextInt();

        for(int a = 1; a <= num; a++){
            for(int b = 1; b <= a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}