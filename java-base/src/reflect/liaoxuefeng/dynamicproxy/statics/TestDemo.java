package reflect.liaoxuefeng.dynamicproxy.statics;
/**
 * @author  xy
 * @date    2021-04-12 22:37:06
 * @desc    静态代理
 */
public class TestDemo {
    public static void main(String[] args) {
        Hello hello = new HelloWorld();
        hello.morning("Liming");
    }
}

interface Hello {
    void morning(String name);
}

class HelloWorld implements Hello {
    public void morning(String name) {
        System.out.println("Good morning, " + name);
    }
}