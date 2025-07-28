import java.util.Scanner;

public class Newtest {
   
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Test9 ob = new Test9();

        System.out.print("Enter a Number :");
        int pat = sc.nextInt();
        String output = ob.pattern(pat);

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
}

class Test8{

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
}

