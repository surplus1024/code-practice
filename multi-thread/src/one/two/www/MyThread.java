package one.two.www;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("running " + Thread.currentThread().getName());
    }
}
