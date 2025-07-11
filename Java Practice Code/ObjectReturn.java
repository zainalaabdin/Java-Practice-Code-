class Beand{
    int var1;
    int var2;

}


class DataClass{

    int a=20;
    int b=20;

    public DataClass returnObject(){

        return ob;
    }

}

public class ObjectReturn {
    public static void main(String arg[]){
        DataClass ob = new DataClass().returnObject();
        System.out.println(ob);
    }
}
