import java.util.*;
public class ArraySumNumbers {
    public static void main(String arg[]){

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 8, 10, 2, 12, 2, 20));
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
         System.out.println(sum);  
    }   
}