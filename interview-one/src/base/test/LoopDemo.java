package base.test;

/**
 * @author：xy
 */
public class LoopDemo {
    public static void main(String[] args) {

    }

    static void test6(){
        for (int i = 0; i < 5; i++) {
            System.out.println("for-asc:" + i);
        }

        for (int j = 4; j > -1; j--) {
            System.out.println("for-desc: " + j);
        }

        int m = 0;
        while (m < 5){
            System.out.println("while-asc: " + m);
            m++;
        }

        int n = 4;
        while (n > -1){
            System.out.println("while-desc: " + n);
            n--;
        }

        int p = 0;
        do {
            System.out.println("while-do-asc: " + p);
            p++;
        } while (p < 5);

        int q = 4;
        do {
            System.out.println("while-do-desc: " + q);
            q--;
        } while (q > -1);

    }
}
