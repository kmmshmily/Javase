package javase.IO;

import java.io.*;

/**
 * @program: book-java-for-demo
 * @description: 文件测试类
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-11 21:32
 **/

public class IOTest {
    public static void main(String[] args) throws Exception{
        PrintStream ps = new PrintStream(new FileOutputStream("E:\\kmmshmily.txt"));
////        ps.println("111111111111");
//        ps.println(new IOTest());

        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = bd.readLine()) != null){
            System.out.println("读取："+line);
        }

    }

    @Override
    public String toString() {
        return "朱萌萌， I love you!";
    }
}
