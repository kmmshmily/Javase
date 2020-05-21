package javase.standard;

/**
 * @program: book-java-for-demo
 * @description: String 基本使用
 * @author: kmmshmily--cuiyong
 * @date: 2020-05-21 23:24
 **/

public class StringStandardTest {
    public static void main(String[] args) {
        String s0 = "hello";
        String s1 = "hello";
        String s2 = "he"+"llo";
        String s3 = new String("hello");
        System.out.println(s0 == s1);
        System.out.println(s0 == s2);
        System.out.println(s0 == s3);
        System.out.println(s0 = "1111");
    }
}   
