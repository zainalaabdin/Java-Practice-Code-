class Printer {
    synchronized void printName(String name) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }

    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class NameThread extends Thread {
    Printer printer;

    NameThread(Printer p) {
        this.printer = p;
    }

    public void run() {
        printer.printName("ZAIN");
    }
}

class NumberThread extends Thread {
    Printer printer;

    NumberThread(Printer p) {
        this.printer = p;
    }

    public void run() {
        printer.printNumbers();
    }
}

public class SyncSimpleExample {
    public static void main(String arg[]) {
        Printer printer = new Printer();

        NameThread t1 = new NameThread(printer);
        NumberThread t2 = new NumberThread(printer);

        t1.start();
        t2.start();
    }
}
