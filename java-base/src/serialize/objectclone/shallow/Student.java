package serialize.objectclone.shallow;
/**
 * @author  xy
 * @date    2021-04-15 23:15:52
 * @desc    对象的拷贝-前拷贝
 */
public class Student implements Cloneable {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public Object clone(){
        Student stu = null;
        try {
            stu = (Student) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return stu;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setNum(123);
        Student s2 = (Student) s1.clone();
        System.out.println("s1: " + s1.getNum());
        System.out.println("s2: " + s2.getNum());

        s2.setNum(456);
        System.out.println("s1: " + s1.getNum());
        System.out.println("s2: " + s2.getNum());
    }
}
