package MultiThreading;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MultiRunnable());
        Thread thread2 = new Thread(new MultiRunnable());
        thread1.start();
        thread2.start();
    }
}