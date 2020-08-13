package javase.thread;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @program: book-java-for-demo
 * @description: nio test
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-10 12:38
 **/

public class NIOTest {
    public static void main(String[] args) throws Exception{
        RandomAccessFile file = null;

        FileChannel fc = file.getChannel();

        fc.map(FileChannel.MapMode.PRIVATE,0, 0);
        ByteBuffer buf = ByteBuffer.allocate(1024);
        fc.read(buf);

        ByteBuffer mbbuf = MappedByteBuffer.allocate(1024);

    }
}   
