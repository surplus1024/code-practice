package reflect.liaoxuefeng.dynamicproxy.dynamic2;

import javafx.scene.shape.HLineTo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class LogInvocationHandler implements InvocationHandler {
    private Hello hello;
    public LogInvocationHandler(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("sayHello".equals(method.getName())){
            System.out.println("you said: " + Arrays.toString(args));
        }
        return method.invoke(hello,args);
    }

    public static void main(String[] args) { // 使用
        Hello hello = (Hello)Proxy.newProxyInstance(
                Hello.class.getClassLoader(), // 1. 类加载器
                new Class<?>[] {Hello.class}, // 2. 代理需要实现的接口，可以有多个
                new LogInvocationHandler(new HelloImpl()));// 3. 方法调用的实际处理者
        System.out.println(hello.sayHello("I love you!"));
    }
}
