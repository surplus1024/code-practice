package aop.dynamic.jdk;

import aop.dynamic.statics.AbstractInterface;
import aop.dynamic.statics.Target;

/**
 * @author：xy
 */
public class ProxyTest {

    public static void main(String[] args) {
        // 1. create target object
        AbstractInterface target = new Target();
        // 2. create proxy object
        AbstractInterface proxy = (AbstractInterface) ProxyFactory.getProxyInstance(target);
        proxy.buyHouse();
    }
}
