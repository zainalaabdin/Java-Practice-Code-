class GetNameExample extends Thread {
    public void run() {
        System.out.println("Thread Name: " + getName());
    }

    public static void main(String[] args) {
        GetNameExample t1 = new GetNameExample();
        t1.start();
    }
}
