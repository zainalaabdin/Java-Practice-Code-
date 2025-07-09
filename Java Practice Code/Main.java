class Adder{
    int result;

    Adder(int a, int b){
        result = a + b;
    }
    void display(){
        System.out.print("Addition of two numbers : "+ result);   
    }
    static Adder addNumbers(int a, int b){
        return new Adder(a, b);
    }
}

public class Main{

    public static void main(String arg[]){
        Adder obj = Adder.addNumbers(10, 50);
        obj.display();
    }
}