package reflect.liaoxuefeng.dynamicproxy.dynamic2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;
/**
 * @author  xy
 * @date 2021-04-14 10:33:30
 * @desc cglib 动态代理演示
 */
public class MyMethodInterceptor implements MethodInterceptor {
    /**
     * 1）obj表示增强的对象，即实现这个接口类的一个对象；
     * 2）method表示要被拦截的方法；
     * 3）args表示要被拦截方法的参数；
     * 4）proxy表示要触发父类的方法对象；
     * @param obj
     * @param method
     * @param args
     * @param proxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("You said: " + Arrays.toString(args));
        return proxy.invokeSuper(obj, args);
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloConcrete.class);
        enhancer.setCallback(new MyMethodInterceptor());

        HelloConcrete hello = (HelloConcrete) enhancer.create();
        System.out.println(hello.sayHello("I love you!"));
    }
}
