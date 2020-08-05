package util;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @program: book-java-for-demo
 * @description: 时间测试
 * @author: kmmshmily--cuiyong
 * @date: 2020-07-25 13:06
 **/

public class DateUtil {
    public static void main(String[] args) {
        DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
//        Date currentDate = new Date();
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(currentDate));
//        currentDate.setDate(currentDate.getDate()+1);  //+1天时间
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(currentDate));
//        System.out.println(LocalDate.now().plusDays(1).format(isoDate));
//
//
//        Date currentDate = new Date();
//        currentDate.setDate(currentDate.getDate()+365 *4);  //+1天时间
//        String deliveryDate = new SimpleDateFormat("yyyy-MM-dd").format(currentDate);
//        System.out.println(deliveryDate);

        System.out.println("A".equalsIgnoreCase("b"));
        System.out.println(new BigDecimal(-2));
        BigDecimal b1 = new BigDecimal(100);
        System.out.println(b1.add(b1.negate()));

    }
}   
