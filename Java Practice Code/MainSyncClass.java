class NamePrint{
    synchronized void printName(String pattern){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(pattern + " ");
            }
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}


class Thread1 extends Thread{
    NamePrint print;
    Thread1(NamePrint p){
        this.print = p;
    }
    public void run(){
        print.printName("zain");
    }
}

class Thread2 extends Thread{
    NamePrint print;
    Thread2(NamePrint p){
        this.print = p;
    }
    public void run(){
        print.printName("essa");
    }
}

public class MainSyncClass{
    public static void main(String arg[]){
        NamePrint print = new NamePrint();

        Thread1 t1 = new Thread1(print);
        Thread2 t2 = new Thread2(print);

        t1.start();
        t2.start();
        
    }
}