package reflect.liaoxuefeng.dynamicproxy.dynamic2;
/**
 * @author  xy
 * @date 2021-04-14 10:48:29
 * @desc cglib 要代理的类
 */
    public class HelloConcrete {
    public String sayHello(String str) {
        return "HelloConcrete: " + str;
    }
}
