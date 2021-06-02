package util;

import java.math.BigDecimal;

/**
 * @program: book-java-for-demo
 * @description: 测试
 * @author: kmmshmily--cuiyong
 * @date: 2020-11-03 15:08
 **/

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal a1 = new BigDecimal(0);
        BigDecimal a2 = new BigDecimal(100);
        System.out.println(a1.divide(a2));
    }
}   
