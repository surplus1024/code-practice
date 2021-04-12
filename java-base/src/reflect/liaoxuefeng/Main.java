//package reflect.liaoxuefeng;
//import java.lang.reflect.Field;
//
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        Object p = new Person("Xiao Ming");
//        Class c = p.getClass();
//        Field f = c.getDeclaredField("name");
//        Object value = f.get(p);
//        System.out.println(value); // "Xiao Ming"
//    }
//}
//
//class Person {
//    private String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//}