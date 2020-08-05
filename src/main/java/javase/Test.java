package javase;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import java.nio.ByteOrder;

/**
 * @program: book-java-for-demo
 * @description: 测试
 * @author: kmmshmily--cuiyong
 * @date: 2020-07-14 14:10
 **/

public class Test {
    public static void main(String[] args) {
//        byte[] buf = new byte[Integer.MAX_VALUE];
//        System.out.println(new byte[Integer.MAX_VALUE].length);
//        long l1 = 2147483647
//        long l2 = 85_8993_4592L;
//        Runtime.getRuntime().maxMemory();
//        System.out.println(new StringBuffer().toString());
//
//        System.out.println("".equals(new StringBuffer().toString()));
//
//        Test test = new Test();
//        System.out.println(ClassLayout.parseInstance(test).toPrintable());

        Test test = new Test();
//        System.out.println(test.hashCode());
        System.out.println(ByteOrder.nativeOrder());

        System.out.println(VM.current().details());

        System.out.println(ClassLayout.parseInstance(test).toPrintable());
    }
}   
