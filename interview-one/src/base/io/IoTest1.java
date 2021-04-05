package base.io;


import java.io.*;

public class IoTest1 {
    public static void main(String[] args) {
//        count(a);
        StrTest();
//        readTest();
    }
    /**
     * 给定一个文本,获取某字符串出现的次数
     */
    public static void count(String inputStr){
        File file = new File("/Users/mac/Desktop/countChar.txt");
        InputStream is = null;
        try{
            is = new FileInputStream(file);
        }catch(Exception e){
            e.printStackTrace();
        }
        byte[] b = new byte[1024];
        int a = 0;
        try {
            a = is.read(b);
        }catch (Exception e){
            e.printStackTrace();
        }
        String[] str = new String(b,0,a).split("");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if(inputStr.equals(str[i])){
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    /**
     * read 读取文件案例
     */
    public static void readTest(){
        File file =new File("/Users/mac/Desktop/countChar.txt");
        try {
            Reader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            String data =null;
            while((data = buffered.readLine())!=null){
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试 new String(byte[] b,0,len)
     */
    public static void StrTest(){
        byte[] b= {'a','b','c','d'};

        int len =b.length-1;
//        String xx = new String(b, 0, len);
        String xx = new String(b, 0, b.length);
        System.out.println(xx); // abc
    }
}
