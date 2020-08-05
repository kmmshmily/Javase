package javase.net;

import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: book-java-for-demo
 * @description: Socket测试类
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-05 12:53
 **/

public class SocketTest {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1025);
            while (true){
                Socket socket = server.accept();
                InputStream os = socket.getInputStream();
                byte[] buff = new byte[10241];
                os.read(buff);
                System.out.println(new String(buff));
                socket.getOutputStream().write(buff);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}   
