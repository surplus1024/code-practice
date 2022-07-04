package aop.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author：xy
 * @desc: proxy factor
 */
public class ProxyFactory {

    public static Object getProxyInstance(Object target) {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new CustomInvocationHandler(target);

        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
