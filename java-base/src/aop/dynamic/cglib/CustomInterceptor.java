package aop.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author：xy
 */
public class CustomInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CustomerInterceptor: before");
        Object ret = methodProxy.invokeSuper(o, objects);
        System.out.println("CustomerInterceptor: after");
        return ret;
    }
}
