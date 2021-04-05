package base.test;
import java.io.*;

public class IoTest {
    public static void main(String[] args) {
        //            writeFileTest();
        readFileTest();
    }

    /**
     * 写入到文件中
     * @throws IOException
     */
    public static void writeFileTest() throws IOException {
        File file = new File("/Users/mac/Desktop/countChar2.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write('a');
        fos.write('b');
        fos.close();
    }

    /**
     * 从文件中国读取
     */
    public static void readFileTest() {
        File file = new File("/Users/mac/Desktop/countChar2.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            for (int i = 0; i < file.length(); i++) {
                try {
                    System.out.println((char) fis.read());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
