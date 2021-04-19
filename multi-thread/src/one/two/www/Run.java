package one.two.www;

public class Run {
    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        t1.start();
//        System.out.println("runing end");

//        MyRunnable myRunnable = new MyRunnable();
//        Thread t1 = new Thread(myRunnable);
//        t1.start();
        MyThread t = new MyThread();
        Thread a = new Thread(t, "a");

        Thread b = new Thread(t, "b");
        Thread.sleep(2000);

        Thread c = new Thread(t, "c");
//        a.start();
        System.out.println("b before Current Thread " + Thread.currentThread().getName());
//        b.run();
        a.start();
        Thread.sleep(2000);
        System.out.println("b after Current Thread " + Thread.currentThread().getName());
//        c.start();
    }
}
