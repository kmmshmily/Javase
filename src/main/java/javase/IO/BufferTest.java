package javase.IO;

import java.nio.CharBuffer;

/**
 * @program: book-java-for-demo
 * @description:
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-12 23:06
 **/

public class BufferTest {
    public static void main(String[] args) {
        //创建buffer
        CharBuffer buff = CharBuffer.allocate(8);
        System.out.println("capacity: "+ buff.capacity());
        System.out.println("limit:" + buff.limit());
        System.out.println("position: " + buff.position());

        //放入元素
        buff.put('a');
        buff.put('b');
        buff.put('c');
        System.out.println("加入3个元素之后， position: " + buff.position());

        //调用flip
        buff.flip();
        System.out.println("执行flip之后， limit: " + buff.limit());
        System.out.println("position = " + buff.position());

        //取出第一个元素
        System.out.println("第一个元素(position=0): " + buff.get());
        System.out.println("取出第一个元素之后， position : " +buff.position());
        System.out.println("******************");
        //调用clear方法
        buff.clear();
        System.out.println("执行clear之后， limit: " + buff.limit());
        System.out.println("执行clear之后， position: " + buff.position());

        System.out.println("执行clear()之后， 缓冲区内容并没有被清除 ：" + buff.get(2));
        System.out.println("执行绝对读取后， position: " +buff.position());
    }
}   
