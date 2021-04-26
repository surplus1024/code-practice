package base.test;

public class Ceshi {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
    }
    static int add(int a, int b) {
        try {
            int c = a + b;
            return c;
        } catch (Exception exception) {
            return a + 2 * b;
        } finally {
            return a + 3 * b;
        }
    }
}
