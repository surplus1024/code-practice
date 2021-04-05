package one.two.www;

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(00);
        System.out.println("run end");
    }
}
