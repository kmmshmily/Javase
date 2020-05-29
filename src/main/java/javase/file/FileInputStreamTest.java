package javase.file;

import java.io.File;
import java.io.FileInputStream;

/**
 * @program: book-java-for-demo
 * @description: fileInputStreamTest
 * @author: kmmshmily--cuiyong
 * @date: 2020-05-25 22:13
 **/

public class FileInputStreamTest {
    public static void main(String[] args) throws Exception{
        var fis = new FileInputStream("F:\\kmmshmily\\Javase\\src\\main\\java\\javase\\file\\FileInputStreamTest.java");
        var buf = new byte[1024];
        var hasRead = 0;
        while ((hasRead = fis.read(buf)) > 0){
            System.out.println(new String(buf, 0, hasRead));
        }
        fis.close();
    }
}   
