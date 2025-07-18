class T1 extends Thread {
    static int i = 0;

    public void run() {
        System.out.println(i++);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i++);
    }
}

public class T2 {
    public static void main(String[] args) {
        T1 test = new T1();
        test.start();

        T1 test2 = new T1();
        test2.start();
    }
}
