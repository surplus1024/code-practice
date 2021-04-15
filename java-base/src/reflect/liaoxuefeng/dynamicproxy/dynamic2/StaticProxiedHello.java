package reflect.liaoxuefeng.dynamicproxy.dynamic2;
/**
 * @author  xy
 * @date    2021-04-13 22:30:54
 * @desc    静态代理,常规的
 */
public class StaticProxiedHello implements Hello {
    private Hello hello = new HelloImpl();
    @Override
    public String sayHello(String str) {
        System.out.println("You said: " + str);
        return hello.sayHello(str);
    }

    public static void main(String[] args) {
        StaticProxiedHello staticProxiedHello = new StaticProxiedHello();
        staticProxiedHello.sayHello("love you");
    }
}
