public class Atm {
    public static void main(String arg[]){
        
        int a = 8888;

        int fth = a / 5000;
        a %= 5000;
        int th = a / 1000;
        a %= 1000;
        int fi = a / 500;
        a %= 500;
        int hu = a / 100;
        a %= 100;
        int fif = a / 50;
        a %= 50;
        int tw = a / 20;
        a %= 20;
        int ten = a / 10;
        a %= 10;
        int fiv = a / 5;
        a %= 5;
        int two = a / 2;
        a %= 2;
        int one  = a / 1;
        a %= 1;

        System.out.println("Five Thousand note is :" + fth);
        System.out.println("Thousand Note is: " + th);
        System.out.println("Five Hundred Note is: " + fi);
        System.out.println("Hundred Note is: " + hu);
        System.out.println("Fifty Note is: " + fif);
        System.out.println("Twenty Note is: " + tw);
        System.out.println("Ten Note is: " + ten);
        System.out.println("Five Note is: " + fiv);
        System.out.println("Two Note is: " + two);
        System.out.println("One Note is: " + one);

    }
    
}
