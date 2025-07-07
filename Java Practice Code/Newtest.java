import java.util.Scanner;

public class Newtest {
   
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Test9 ob = new Test9();

        System.out.print("Enter a Number :");
        int input = sc.nextInt();
        String output = ob.pattern(input);

        System.out.println(output);

        output = Test9.pattern2(input);

        System.out.println(output);
        
    }
}



class Test9{

     public String pattern(int num){

        String out = "";
        
        for(int a = 1; a <= num; a++){
            for(int b = 1; b <= a; b++){
                out += "*";
            }
            out += "\n";
        }

        return out;
    }

    public static String pattern2(int num){

        String out = "";
        
        for(int a = 1; a <= num; a++){
            for(int b = 1; b <= a; b++){
                out += "*";
            }
            out += "\n";
        }

        return out;
    }
}

