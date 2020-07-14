package javase.standard;

/**
 * @program: book-java-for-demo
 * @description: VarTest
 * @author: kmmshmily--cuiyong
 * @date: 2020-05-21 21:39
 **/

public class VarTest {
    public static void main(String[] args) {
        System.out.println(args);
        var a = 1;
        System.out.println(a);
        a = 3;
        var d = (byte) 1_3;
//        d = a;
        a = (byte)1;

    }
}

