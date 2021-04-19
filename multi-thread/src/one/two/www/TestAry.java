package one.two.www;

public class TestAry {
    public static void main(String[] args) {
        // 声明数组的两种方式
        int ary[];
        int[] ary2;
        // 创建数组

        int[] list = {1,3,4};
        int[] listRv = reverse(list);
        System.out.println(list.toString());
        for (int el: listRv) {
            System.out.println(el);
        }
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
