package javase.standard;

/**
 * @program: book-java-for-demo
 * @description: 自动转换
 * @author: kmmshmily--cuiyong
 * @date: 2020-05-21 22:31
 **/

public class AutoConversion {
    public static void main(String[] args) {
        int a = 6;
        float f = a;
        System.out.println(f);
        byte b = 9;
//        char c = (int)b;
        double d = b;
        System.out.println(d);
    }
}   
