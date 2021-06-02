package javase;

/**
 * @program: book-java-for-demo
 * @description: 测试
 * @author: kmmshmily--cuiyong
 * @date: 2021-05-27 00:39
 **/

public class Test01 {


    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }

}

class A{
    public static int m = 100;
    static {
        m = 300;
    }



    public A() {
    }
}