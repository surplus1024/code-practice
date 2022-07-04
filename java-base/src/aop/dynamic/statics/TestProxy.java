package aop.dynamic.statics;

/**
 * @author：xy
 */
public class TestProxy {
    public static void main(String[] args) {
        Target target = new Target();

        Proxy proxy = new Proxy(target);

        proxy.buyHouse();
    }
}
