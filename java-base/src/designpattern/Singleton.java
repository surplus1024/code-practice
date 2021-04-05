package designpattern;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 单例模式 有九种实现方式
 */
// 懒汉式（懒加载 lazy loading）;线程不安全
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }

}

// 懒汉式2；线程安全，浪费资源，效率底
class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}
    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}

// 饿汉式；线程安全;第一次运行懒加载，后续不会
class Singleton3 {
    private static Singleton3 singleton3= new Singleton3();
    private Singleton3(){};
    public Singleton3 getSingleton3() {
        return singleton3;
    }
}

// 静态类内部加载（线程安全）;懒加载
class Singleton4 {
    private static class SingletonHolder{ // 内部类
        private static Singleton4 instance = new Singleton4();
    }
    private Singleton4(){}
    public static Singleton4 getInstance() {
        return SingletonHolder.instance;
    }
}
// 枚举 (1)自由串行化。 (2)保证只有一个实 (3)线程安全。
enum Singleton5 {
    INSTANCE;
    public void otherMethods(){

    }
}
class Hello {
    public static void main(String[] args){
        Singleton5.INSTANCE.otherMethods();
    }
}

//双重校验锁法（通常线程安全，低概率不安全）
class Singleton6 {
    private static Singleton6 instance;
    private Singleton6(){}
    public static Singleton6 getInstance(){
        if(instance == null) {
            synchronized (Singleton6.class){
                if(null == instance){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }

}

// 终极解决方案
class Singleton7 {
    private volatile static Singleton7 instance = null;
    private Singleton7(){}
    public static Singleton7 getInstance(){
        if(instance == null){
            synchronized (Singleton7.class){
                if(instance == null) {
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }
}

//使用ThreadLocal实现单例模式（线程安全）
class Singleton8 {
    private static final ThreadLocal<Singleton8> tlSingleton =
            new ThreadLocal<Singleton8>() {
                @Override
                protected Singleton8 initialValue() {
                    return new Singleton8();
                }
            };
    public static Singleton8 getInstance() {
        return tlSingleton.get();
    }
    private Singleton8() {}
}


// 更加优美的Singleton, 线程安全的
class Singleton9 {
    /** 利用AtomicReference */
    private static final AtomicReference<Singleton9> INSTANCE = new AtomicReference<Singleton9>();
    private Singleton9(){    }
    public static final Singleton9 getInstance() { // 用CAS确保线程安全
        for (; ; ) {
            Singleton9 current = INSTANCE.get();
            if (current != null) {
                return current;
            }
            current = new Singleton9();
            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }}