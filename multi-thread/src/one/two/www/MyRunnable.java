package one.two.www;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("runnging " + Thread.currentThread().getName());
    }
}
