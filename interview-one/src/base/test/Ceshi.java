package base.test;

import java.util.Arrays;
import java.util.Scanner;

public class Ceshi {
    public static void main(String[] args) {
//        System.out.println(add(2, 3));
        int[] int1 = {1,2,3};
        int [] int2 = new int[3];
//        System.out.println(int1[1]);
//        System.out.println("hello".substring(1));

//        System.out.println(canConstruct("aa","ab"));
//        lastWordLenght();
//        test1();
//        checkRepeat(new int[]{11,22,33,22,11});

//        middleNode()
//        test3();
//        forTest();
        test6();
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

    static void test5(){
        Integer a = 0;
        int b = 0;
        for (int i = 0; i < 99; i++) {

        }
        a = a ++;
        System.out.println("a: " + a);
        b = a ++;
        System.out.println(a);
        System.out.println(b);
    }

    static void test4(){
        int a = 0;
        int b = 0;
        for (int i = 0; i < 3; i++) {
            a = a++;
            b = ++b;
        }

        System.out.println(a); // 0
        System.out.println(b); // 1

    }

    static void forTest(){
        for (int i = 0,j=0 ; i < 5; i++,++j) {
            System.out.println("i: " + i);
            System.out.println("j: " + j);
        }
    }

     static void test3(){
        int[] ary = {1,2,3,4,5}; // int[] ary = {1,2,3,4,5};
//        for (int i = 0; i < ary.length; i++) {
//            System.out.println("ary[" + i + "]=" + ary[i]);
//        }

        int j = 0;
//         while (j < ary.length) {
//             System.out.println("ary[" + j + "]=" + ary[j]);
//             j++; // ++j; 在这里效果一样的
//         }

         do {
             System.out.println("ary[" + j + "]=" + ary[j]);
             j++; // ++j; 在这里效果一样的
         }while ( j <ary.length);

    }

    static void test2(){
        /*有一个整型数组，获取里面重复的前三个数字*/
        int[] ints = {1,22,22,3,4,4,4};
        int[][] str2 = {};
        for (int i = 0; i < ints.length; i++) {
//            str2.
        }

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void checkRepeat(int[] nums) {
        int[] tempList = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums.length) {
                if (tempList[nums[i]] == 0) {
                    tempList[nums[i]] = nums[i];
                } else {
                    System.out.println("重复数字为:" + nums[i]);
                }
            }

        }
        System.out.println(Arrays.toString(tempList));
    }
    public static ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode p = head;
        while(head.next != null){
            count++;
            head = head.next;
        }
        count = count/2;

        while(count > 0) {
            p = p.next;
            count--;
        }
        return p;
    }


    static void test1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());
//        System.out.println(scanner.hasNext());
        System.out.println(scanner.nextLine());
    }

    static void lastWordLenght(){
//        String str = "hello nowcoder";
//        String[] strs = str.split(" ");
//        return strs[strs.length -1].length();
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        StringBuilder sbuilder = new StringBuilder();
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            sbuilder =sbuilder.append(in.nextInt());
        }
        String[] strs = sbuilder.toString().split(" ");
        int length = strs[strs.length - 1].length();
        System.out.println(length);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int length = ransomNote.length();
        for(int i =0 ; i < length; i++ ){
            String tmp = ransomNote.substring(i,i+1);
            if(magazine.indexOf(tmp)!=-1){
                int index = magazine.indexOf(tmp);
                magazine = magazine.substring(index,index+1) + magazine.substring(index+2);
            }else {
                return false;
            }
        }
        return true;
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


