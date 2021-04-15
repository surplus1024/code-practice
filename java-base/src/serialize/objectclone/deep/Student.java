package serialize.objectclone.deep;

public class Student implements Cloneable {
    private int num;
    private Address add;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student stu = (Student) super.clone();
        stu.add = (Address) add.clone();
        return stu;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.setNum(1);
        Address address = new Address();
        address.setName("HangZhou");
        s1.setAdd(address);
        Student s2 = (Student) s1.clone();

        System.out.println("s1: " + s1.getNum() + ", " + s1.getAdd().getName());
        System.out.println("s2: " + s2.getNum() + ", " + s2.getAdd().getName());
        s2.getAdd().setName("BeiJing");
        System.out.println("s1: " + s1.getNum() + ", " + s1.getAdd().getName());
        System.out.println("s2: " + s2.getNum() + ", " + s2.getAdd().getName());


    }
}

class Address implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}