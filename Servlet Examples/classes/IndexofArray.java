import java.util.*;

public class IndexofArray {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(9);
        arr.add(7);
        arr.add(6);
        arr.add(9);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(50);
        arr.add(0);
        

        System.out.print("ENTER ANY NUMBER FROM 1 TO 10 :");
        int input = sc.nextInt();

        for(int a = 0; a < arr.size(); a++){
        
            if(arr.get(a) == input){
                System.out.print("Index of " + input + " is " + a);
                break;    
            }
        }
    }
    
}
