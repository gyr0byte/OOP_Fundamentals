package MultiThreading;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MultiRunnable("Ping"));
        Thread thread2 = new Thread(new MultiRunnable("Pong"));
        thread1.start();
        thread2.start();
    }
}