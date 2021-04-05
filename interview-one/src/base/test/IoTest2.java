package base.test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class IoTest2 {

    public static void main(String[] args) throws IOException {
//        writeIo();
//        readIo();
//        outputStreamWriter();
//        inputStreamReader();
        inputNIOChannel();
    }

    /**
     * 字节输出流
     */
    public static void writeIo() throws IOException {
        File file = new File("./test2-1.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("hello world".getBytes());
        fos.flush();
        fos.close();
    }
    /**
     * 字节输入流
     */
    public static void readIo() throws IOException {
        File file = new File("./test2-1.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bts = new byte[1024];
        int len = fis.read(bts);
        System.out.println(new String(bts, 0, len));
        fis.close();
    }
    /**
     * 字符输出流
     */
    public static void outputStreamWriter() throws IOException {
        File file = new File("./test2-2.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("welcome java space");
        writer.flush();
        writer.close();
    }
    /**
     * 字符出入流
     */
    public static void  inputStreamReader() throws IOException{
        File file = new File("./test2-2.txt");
        FileReader reader = new FileReader(file);
        char[] chars = new char[1024];
        int len = reader.read(chars);
        System.out.println(new String(chars, 0, len));
        reader.close();
    }
    /**
     * NOI
     */
    public static void inputNIOChannel() throws IOException {
        File file = new File("./test2-2.txt");
        FileInputStream fis = new FileInputStream(file);
        FileChannel channel = fis.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(1024);
        int bufRead = channel.read(buf);
        if(bufRead != -1){
            buf.flip();
            while (buf.hasRemaining()){
                System.out.print((char)buf.get());
            }
            buf.compact();
            bufRead = channel.read(buf);

        }
    }

}
