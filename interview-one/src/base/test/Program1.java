package base.test;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        int[] arr ={11, 2, 7, 15};
        findTargetArray1(arr,13);
//        for (int i: result  ) {
//            System.out.println(result[i]);
//        }
//        System.out.println(Arrays.toString(result));
    }
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * 示例:给定 nums = [2, 7, 11, 15], target = 9，因为 nums[0] + nums[1] = 2 + 7 = 9，所以返回 [0, 1]。
     */
    public int[] gainAry(int[] arr,int target){
        int[] a = {1,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

            }
        }
        return a;
    }

    public static int[] bubbleSort1(int [] a, int target) {
        int i, j;
        int[] result = new int[2];
        for (i = 0; i < a.length; i++) {//表示n次排序过程。
            for (j = 1; j < a.length - i; j++) {
                if(a[j-1] + a[j] == target) {
                     result[0] = j-1;
                     result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    private void processSelectSort2(int[] arr,int target) {
        for (int i = 1; i < arr.length; i++) {
            // 只是将这两句代码的代表当前要插入的下标用外循环的变量来代替了
            int currentInsertValue = arr[i];
            int insertIndex = i - 1;

            while (insertIndex >= 0
                    && (currentInsertValue + arr[insertIndex] == target)
            ) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = currentInsertValue;
            System.out.println("第 " + i + " 轮排序后：" + Arrays.toString(arr));
        }
    }

    public static int[] findTargetArray1(int a[],int target) {
        int len = a.length;
        int[] result = new int[2];
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println(a[i] +"," + a[j]);
                    System.out.println(i +"," + j);
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
