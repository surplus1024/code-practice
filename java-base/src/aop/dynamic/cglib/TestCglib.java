package aop.dynamic.cglib;

import aop.dynamic.statics.Target;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author：xy
 */
public class TestCglib {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        enhancer.setCallback(new CustomInterceptor());
        Target proxy = (Target) enhancer.create();
        proxy.buyHouse();
    }
}
