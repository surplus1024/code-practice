package one.two.www;

public class Run {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//        System.out.println("runing end");

//        MyRunnable myRunnable = new MyRunnable();
//        Thread t1 = new Thread(myRunnable);
//        t1.start();
        MyThread t = new MyThread();
        Thread a = new Thread(t, "a");
        Thread b = new Thread(t, "b");
        Thread c = new Thread(t, "c");
        Thread d = new Thread(t, "d");
        Thread e = new Thread(t, "e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
