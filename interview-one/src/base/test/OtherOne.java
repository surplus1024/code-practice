package base.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtherOne {
    public static void main(String[] args) {
//        list2Ary1();
//        list2Ary2();
//        ary2List1();
        str2Ary2();
    }

    // list to array 1
    public static void list2Ary1() {
//        ArrayList<String> list = new ArrayList<String>(){{add("test1"); add("test2");}};
        List testList = new ArrayList(){{add("aa");add("bb");add("cc");}};
        String[] ary = new String[testList.size()];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = testList.get(i).toString();
        }
        System.out.println(testList);
        System.out.println(ary);
    }

    // list to array 2
    public static void list2Ary2() {
        List<String> testList = new ArrayList<String>(){{add("aa");add("bb");add("cc");}};
//        String strings[]=(String [])testList.toArray();
        String[] array2 = testList.toArray(new String[testList.size()]);
        System.out.println(testList);
        System.out.println(array2);
    }

    // array to list methods 1
    public static void ary2List1(){
        String[] strAry = new String[]{"aa","bb","cc"};
        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < strAry.length; i++) {
//            list.add(strAry[i]);
//        }
        for (String str : strAry) {
            list.add(str);
        }
        System.out.println(strAry);
        System.out.println(list);
    }

    public static void str2Ary2() {
        String[] strAry2 = new String[]{"aa","bb","cc"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(strAry2));
        System.out.println(strAry2);
        System.out.println(arrayList);
    }
}
