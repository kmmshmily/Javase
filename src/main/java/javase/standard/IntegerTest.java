package javase.standard;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: book-java-for-demo
 * @description: 整型测试
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-21 09:49
 **/

public class IntegerTest {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();
        System.out.println(">>>>>>>>>>>>");
    }
}   
