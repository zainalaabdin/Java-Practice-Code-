class GetPriorityExample extends Thread {
    public void run() {
        System.out.println("Thread Priority: " + getPriority());
    }

    public static void main(String[] args) {
        GetPriorityExample t1 = new GetPriorityExample();
        t1.setPriority(10); 
        t1.start();
    }
}
