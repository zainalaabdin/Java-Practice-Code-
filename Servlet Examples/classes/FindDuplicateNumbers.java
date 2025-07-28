import java.util.*;
public class FindDuplicateNumbers {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 8, 10, 2, 12, 2, 20));
        System.out.print("Enter Number to find Duplicate Numbers :");
        int num = sc.nextInt();

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == num){
                System.out.println("Duplicate Number Index at :" + i);
            }
        }
        if(!arr.contains(num)){
            System.out.print("Not found");
        }
    }
    
}
