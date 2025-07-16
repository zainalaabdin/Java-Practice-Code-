import java.util.*;
public class ArrExample{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
      

        for(int a = 0; a < 5; a++){
            System.out.print("Enter the number on location "+a+": ");
            int num = sc.nextInt();
            arr.add(num);
        }
        System.out.println(" ");
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));

        }
    }
}