package reflect.liaoxuefeng;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
//        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>(){{add(123);add(45);}};
        Class<? extends ArrayList> aClass = list.getClass();
        Method add = aClass.getMethod("add", Object.class);
        add.invoke(list, "abc");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

