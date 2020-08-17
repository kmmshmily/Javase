package javase.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * @program: book-java-for-demo
 * @description:
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-13 22:24
 **/

public class FileChannelTest {
    public static void main(String[] args) {
        File file = new File("E:\\kmmshmily.txt");
        try {
            FileChannel fcIn = new FileInputStream(file).getChannel();
            FileChannel fcOut = new FileOutputStream("E:\\kmmshmily-kcyshmily.txt").getChannel();

            //将FileChannel里的全部数据映射成MappedByteBuffer
            MappedByteBuffer mbbuf = fcIn.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
            //使用GBK的字符集来创建解码器
            Charset charset = Charset.forName("GBK");
            //直接将mbbuf里的数据全部输出
            fcOut.write(mbbuf);
            //再次调用buffer的clear()方法，复原limit, position位置， limit = capacity, position = 0
            mbbuf.clear();
            //创建解码器
            CharsetDecoder decoder = charset.newDecoder();
            //使用解码器将ByteBuffer转换成CharBuffer
            CharBuffer charBuffer = decoder.decode(mbbuf);
            System.out.println(charBuffer);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}   
