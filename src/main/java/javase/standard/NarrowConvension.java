package javase.standard;

/**
 * @program: book-java-for-demo
 * @description: 强制转换
 * @author: kmmshmily--cuiyong
 * @date: 2020-05-21 22:36
 **/

public class NarrowConvension {
    public static void main(String[] args) {
        var iValue = 233;
        byte bValue = (byte) iValue;
        System.out.println(bValue);

        var dValue = 3.98;
        int tol = (int) dValue;
        System.out.println(tol);


    }
}   
