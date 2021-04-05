package one.two.www;

public class MyThread extends Thread {
    private int count = 5;
    public void run() {
        super.run();
        count--;
        System.out.println("count= " + count);
    }
}
