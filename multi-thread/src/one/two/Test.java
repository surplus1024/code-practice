package one.two;

import one.two.www.MyThread2;

public class Test {
    public static void main(String[] args) {
        MyThread2 t11 = new MyThread2(1);
        MyThread2 t12 = new MyThread2(2);
        MyThread2 t13 = new MyThread2(3);
        t11.start();
        t12.start();
        t13.start();
    }
}
