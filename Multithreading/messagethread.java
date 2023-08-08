package Multithreading;

public class messagethread {
    public static void main(String[] args) {
        int num = 3;
        for (int i = 0; i < num; i++) {
            Thread thread = new Thread(() -> {
                String threadName = Thread.currentThread().getName();
                for (int messageno = 1; messageno <= 5; messageno++) {
                    String msg = "Message " + messageno;
                    System.out.println(threadName + " received: " + msg);
                }
            });
            thread.start();
        }
    }
}