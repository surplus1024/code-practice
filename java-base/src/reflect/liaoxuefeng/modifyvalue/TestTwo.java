package reflect.liaoxuefeng.modifyvalue;

import java.lang.reflect.Field;

/**
 * @author  xy
 * @date    2021-04-11 22:59:25
 * @desc    通过反射获取字段的值
 */
public class TestTwo {
    public static void main(String[] args) throws Exception {
        Object p = new Person("xiao ming");
        Class cls = p.getClass();
        Field f = cls.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println("getFieldValue: " + value);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
