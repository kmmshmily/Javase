package javase.standard;

/**
 * @program: book-java-for-demo
 * @description: dowhile
 * @author: kmmshmily--cuiyong
 * @date: 2020-05-25 20:57
 **/

public class DoWhileTest {
    public static void main(String[] args) {
        var count = 1;
        do{
            System.out.println(count++);
        }while (count < 10);
        System.out.println("循环结束");
    }
}   
