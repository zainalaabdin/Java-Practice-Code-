class Test5 {
    int a = 10;
    int b = 20;


     void NewMethod() {
      System.out.print("Addition of Two Numbers : "+ (a + b));
        
    }
}

class Test6 extends Test5 {
    // int a = 50;
    void NewMethod(){
       //super keyword
        System.out.print("Substrction of Two Numbers : "+ (a - b));
}
}


public class ExampleMyClass {
    public static void main(String[] args) {
        Test6 obj = new Test6(); 
        obj.NewMethod();
    }
}
