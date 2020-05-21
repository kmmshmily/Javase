package javase.standard;

/**
 * @program: book-java-for-demo
 * @description: 浮点测试
 * @author: kmmshmily--cuiyong
 * @date: 2020-05-21 21:32
 **/

public class FloatTest {
    public static void main(String[] args) {
        float af = 5.234_555_6F;
        System.out.println(af);
        double a = 0.0;
        double c = Double.NEGATIVE_INFINITY;
        float d = Float.NEGATIVE_INFINITY;
        System.out.println(c == d);
        System.out.println(a / a);
        System.out.println(Double.NaN == Double.NaN);
        System.out.println(Double.NaN == Float.NaN);
        System.out.println(Float.NaN == Float.NaN);
        System.out.println(6.0 / 0 == 555.0 / 0);
        System.out.println(-8 / a);
        System.out.println( 8 / 0);
    }
}   
