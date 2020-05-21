package javase.standard;

/**
 * @program: book-java-for-demo
 * @description: IntegerTest
 * @author: kmmshmily--cuiyong
 * @date: 2020-05-21 21:09
 **/

public class IntegerValTest {
    public static void main(String[] args) {
        byte  a = 56;
        System.out.println(a);
        System.out.println(123_234_123);
        int octalValue = 013;
        System.out.println(octalValue);
        System.out.println(0x0af);
        System.out.println("*********以下是二进制数**********");
        int binVal1 = 0b1111111;
        System.out.println(binVal1);
        System.out.println(0b10000000000000010000000000000001);
        System.out.println(0b10000000000000010000000000000001L);
        System.out.println((byte)0b11101001);
    }
}   
