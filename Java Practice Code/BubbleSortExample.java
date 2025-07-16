import java.util.*;
public class BubbleSortExample {
    public static void main(String arg[]){
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(90);
        arr.add(20);
        arr.add(50);
        arr.add(5);
        arr.add(70);
        arr.add(10);
        arr.add(30);

        //int num[] = {90, 20, 50, 5, 70, 10, 30};

        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) > arr.get(j)){
                    int temp  = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        for(int i =0; i < arr.size(); i++){
        System.out.print(arr.get(i)+ " ");
        }
    }
}
