package one.two.www;

public class TestRunAndStart {
    private static void sayHello() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                sayHello();
                System.out.println("Current thread1 " + Thread.currentThread().getName());
            }
        });
//        thread.run();// main
        thread.start(); // Thread-0
    }
}
