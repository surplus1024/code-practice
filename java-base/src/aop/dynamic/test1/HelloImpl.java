package aop.dynamic.test1;

/**
 * @author：xy
 */
public class HelloImpl implements Hello {
    @Override
    public String sayhello(String str) {
        return "HelloImpl: " + str;
    }
}
