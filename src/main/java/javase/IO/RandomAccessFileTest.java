package javase.IO;

import java.io.RandomAccessFile;

/**
 * @program: book-java-for-demo
 * @description: 随机访问文件
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-11 22:00
 **/
public class RandomAccessFileTest {
    public static void main(String[] args) throws Exception{
        RandomAccessFile raf = new RandomAccessFile("F:\\kmmshmily\\Javase\\src\\main\\java\\javase\\IO\\RandomAccessFileTest.java", "r");
        System.out.println("RandomAccessFileTest的文件指针初始位置："+ raf.getFilePointer());
        raf.seek(300);
        byte[] buff = new byte[1024];
        int hasReac = 0;
//        while ((hasReac = raf.read(buff)) > 0){
//            System.out.println("文件指针位置："+hasReac);
//            System.out.println(new String(buff, 0, hasReac));
//        }
        raf.length();
        while ((hasReac = raf.read(buff)) > 0){
            System.out.println(hasReac);
//            System.out.println(raf.read(buff));
        }
    }
}   
