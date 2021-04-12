package reflect.liaoxuefeng.getfieldvalue;

import java.lang.reflect.Field;

/**
 * @author  xy
 * @date    2021-04-11 22:59:25
 * @desc    通过反射修改属性的值
 */
public class ModifyValue {
    public static void main(String[] args) throws Exception {
        Person p = new Person("xiao ming");
        Class cls = p.getClass();
        Field f = cls.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println("getFieldValue: " + value);
        f.set(p,"xiao hong");
        System.out.println("modifyFieldValue: " + p.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
