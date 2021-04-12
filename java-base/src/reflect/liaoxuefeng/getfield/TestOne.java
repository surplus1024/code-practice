package reflect.liaoxuefeng.getfield;
/**
 * @author  xy
 * @date    2021-04-11 22:51:24
 * @desc    reflection 反射练习;获取字段
 */
public class TestOne {
    public static void main(String[] args) throws Exception{
        Class stdClass = Student.class;
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));
    }
}

class Student extends Person {
    public int score;
    private int grade;
}
class Person {
    public String name;
}
