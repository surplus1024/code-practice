package designpattern.singleton;

/**
 * 单例 双重校验锁
 */
public class Singleton2Check {
    private static Singleton2Check instance;
    private Singleton2Check(){};
    public static Singleton2Check getInstance() {
        if(instance == null){
            synchronized (Singleton2Check.class){
                if(instance == null) {
                    return instance = new Singleton2Check();
                }
            }
        }
        return null;
    }
}
