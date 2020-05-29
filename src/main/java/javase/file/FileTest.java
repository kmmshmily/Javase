package javase.file;

import com.alibaba.fastjson.JSON;

import java.io.File;

/**
 * @program: book-java-for-demo
 * @description: 文件基本操作
 * @author: kmmshmily--cuiyong
 * @date: 2020-05-25 21:05
 **/

public class FileTest {
    public static void main(String[] args) {
        File file = new File("E:/book");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canExecute());
        System.out.println(file.lastModified());
        System.out.println(file.canRead());

        System.out.println(JSON.toJSONString(file.list()));
//        System.out.println(file.renameTo(new File("E:\\JMter.pdf")));

        File f2 = new File("E:\\新建文本文档.md");
        f2.deleteOnExit();

        for(File fileTemp : File.listRoots()){
            System.out.println(fileTemp);
        }
        System.out.println();
    }
}   
