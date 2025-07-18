import javax.swing.*;

class Test1 implements Runnable {
    static int i = 0;

    public void run(){
        System.out.println(i++);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i++);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        Thread thread = new Thread(test);
        thread.start();

        Test1 test2 = new Test1();
        Thread thread2 = new Thread(test2);
        thread2.start();
    }
}