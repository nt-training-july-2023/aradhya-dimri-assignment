package Multithreading;

class MyThread extends Thread {
    
    public void run() {
     
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class stateofthread {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        System.out.println("State after creation: " + thread.getState());       
        thread.start();
        System.out.println("State after starting: " + thread.getState());
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State after termination: " + thread.getState());
    }

    
    }
