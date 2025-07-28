class FirstThread extends Thread{
    public void run(){
        for(int i = 0; i <= 3; i++){
            System.out.println("GOOD MORNING");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class SecondThread extends Thread{
    public void run(){
        for(int i = 0; i <= 3; i++){
            System.out.println("Welcome");
        try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Multithreading{
    public static void main(String arg[]){
        FirstThread ft = new FirstThread();
        SecondThread se = new SecondThread();

        ft.start();
        se.start();
    }
}