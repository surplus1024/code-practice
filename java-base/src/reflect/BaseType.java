package reflect;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class BaseType
{
    private static String flag = "Y";
    private String role = "r";
	public static void main(String[] args)  
	{
        reflectionTest3();
	}

    /**
     * 单例模式
     */
//    public static void single

    /**
     * 反射创建类实例的三种方式
     */
	public static void reflectionTest1() {
        try {
            Class<?> userClass = User.class;
            Object inst = userClass.newInstance();
            System.out.println(inst);
//            System.out.println(role); // 静态不可以非访问
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void reflectionTest2(){
        try {
            Class<User> userClass = User.class;
            Constructor<?> constructor = userClass.getConstructor();
            Object inst = constructor.newInstance();
            System.out.println(inst);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void reflectionTest3() {
        try {
            Class<User> userClass = User.class;
            Constructor<User> constructor = userClass.getDeclaredConstructor(String.class,String.class);
            Object instance = constructor.newInstance("abc", "123");
            System.out.println(instance);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void hashMapTest() {
        Map<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("num1","A");
        hashMap.put("num2","B");
        hashMap.put("num3","C");
        // 遍历map的方式
        Set<Map.Entry<String,String>> set = hashMap.entrySet();
        Iterator<Map.Entry<String,String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> Entry = iterator.next();
            String key  = (String)Entry.getKey();
            String value = (String) Entry.getValue();
            System.out.println("key: " + key +" value: " + value);
            System.out.println(flag); // 非静态可以访问静态
        }
    }

    public static class User {
        private String username = "zhangSan";
        private String userpwd = "123";
        private int sex = 0;

        public User(String username, String userpwd) {
            this.username = username;
            this.userpwd = userpwd;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUserpwd() {
            return userpwd;
        }

        public void setUserpwd(String userpwd) {
            this.userpwd = userpwd;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "reflect.BaseType.User{" +
                    "username='" + username + '\'' +
                    ", userpwd='" + userpwd + '\'' +
                    ", sex=" + sex +
                    '}';
        }
    }
}