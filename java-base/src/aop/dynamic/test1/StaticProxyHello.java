package aop.dynamic.test1;

/**
 * @author：xy
 */
public class StaticProxyHello implements Hello {

    private  Hello hello = new HelloImpl();

    @Override
    public String sayhello(String str) {
        System.out.println("you said : " + str);
        return hello.sayhello(str);
    }
}
