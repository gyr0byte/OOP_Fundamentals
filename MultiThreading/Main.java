package MultiThreading;

public class Main {
    public static void main(String[] args) {
        MultiRunnable multiRunnable = new MultiRunnable();
        Thread thread = new Thread(multiRunnable);
        thread.start();
    }
}