package reflect.liaoxuefeng.dynamicproxy.dynamic2;

public class HelloImpl implements Hello{
    @Override
    public String sayHello(String str) {
        return "HelloImpl: " + str;
    }
}
