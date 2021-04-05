package base.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class IoTest1 {

    public static void main(String[] args) {
//        readExample();
        readByteExample();
    }

    public static void readByteExample(){
        try {
            FileInputStream fis = new FileInputStream("/Users/mac/Desktop/countChar.txt");
            byte[] bAry = new byte[28];
            for (int i = 0; i <3; i++) {
                System.out.println("第" + (i + 1) + "次，读取的结果" + fis.read(bAry));
                System.out.println("读取后数组的内容" + Arrays.toString(bAry));
            }


            byte b = 56;
            byte b2 = 'a';
            char c1 = 'c';
//            char c2 = "C";
            byte[] bary2 = new byte[]{'a', 'b'};
            byte[] bary3 = {};
            /**
             * 数组的定义方式 两种方式
             */
            int[] i1 = new int[5];
            int[] i2 = new int[]{'1',2,};
//            int[] i3 = new int[]; // 数组定义必须指定长度
            int[] i4 = {1, 2, 3};

            int [][] a = new int[][]{ {12,34,45,89},{34,56,78,10},{1,3,6,4} };// 二维数组的



        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void readExample(){
        try {
            FileInputStream fis = new FileInputStream("/Users/mac/Desktop/countChar.txt");
            for (int i = 0; i < 5; i++) {
                int read = fis.read();
                char cha = (char) read;
                System.out.println(cha);
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ioe){

        }
    }
}
