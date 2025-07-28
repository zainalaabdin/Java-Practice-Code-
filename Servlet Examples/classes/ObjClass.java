

public class ObjClass{
    public static void main(String arg[]){
        Test1 ob1 = new Test1();
            ob1.i = 5;
            ob1.j = 7;

        Test1 ob2 = new Test1();
            ob2.i = 8;
            ob2.j = 7;

            System.out.print(" OBJECT 1 : " + ob1 + " OBJECT 2 : " + ob2);
        

        Test2 ob3 = new Test2();
            ob3.a = 6;
            ob3.b = 6;
            
        Test2 ob4 = new Test2();
            ob4.a = 7;
            ob4.b = 7;
        
        System.out.print(" OBJECT 1 : " + ob3 + " OBJECT 2 : " + ob4);
    }
}

    class Test1 {
        int i = 8;
        int j =7;
    
        public String toString(){
        return String.valueOf(i) + " " + String.valueOf(j);
    
    }
}

    class Test2{
        int a = 2;
        int b = 3;

        public String toString(){

            return String.valueOf(a) + " " + String.valueOf(b);
        }

    }


