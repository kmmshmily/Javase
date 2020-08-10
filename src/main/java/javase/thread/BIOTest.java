package javase.thread;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: book-java-for-demo
 * @description: bio-test
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-06 12:38
 **/

public class BIOTest {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(100);

        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(8088));
        while (!Thread.currentThread().isInterrupted()) {//主线程死循环等待新连接到来
            Socket socket = serverSocket.accept();
            executor.submit(new ConnectIOnHandler(socket));//为新的连接创建新的线程
        }
    }

    static class ConnectIOnHandler implements Runnable {
        private Socket socket;

        public ConnectIOnHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted() && !socket.isClosed()) {
//                String someThing = socket.read();
                if ("" != null) {
                    //处理数据
//                    socket.write()
                }

            }
        }


    }
}
