package javase.net;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: book-java-for-demo
 * @description:
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-17 13:03
 **/

public class SocketChannelTest {
    public static void main(String[] args) throws Exception{
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress("127.0.0.1", 1025));

        // 打开一个多路复用器
        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while(selector.select() > 0){
            Set<SelectionKey> keys = selector.keys();
            Iterator<SelectionKey> iterator = keys.iterator();
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                if (selectionKey.isAcceptable()) {
                    // 处理逻辑
                }
                if (selectionKey.isReadable()) {
                    // 处理逻辑
                }
            }
        }
        System.out.println("...............");

    }
}   
