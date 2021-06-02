package util;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: book-java-for-demo
 * @description: 时间测试
 * @author: kmmshmily--cuiyong
 * @date: 2020-07-25 13:06
 **/

public class DateUtil {
    public static void main(String[] args) {

        String str = "93408131756638208";
        System.out.println(Long.valueOf(str));

        Date date = new Date();
        date.setDate(31);
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());

        BigDecimal decimal = new BigDecimal(100);
        if(decimal != null){
            System.out.println(decimal.intValue());
        }


//        Calendar calendar = Calendar.getInstance();
//        String createEndTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
//        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 20);
//        calendar.add(Calendar.MINUTE, -42);
//        String createStartTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
//        System.out.println("开始创建时间：" + createStartTime);
//        System.out.println("结束创建时间:" + createEndTime);

//        Calendar date = Calendar.getInstance();
//        String yearSuffix = "FD"+date.get(Calendar.YEAR)
//                +date.get(Calendar.MONTH)
//                +date.get(Calendar.DATE);
//        System.out.println(yearSuffix);
//
//        System.out.println("FD"+new SimpleDateFormat("yyyyMMdd").format(new Date()));

//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(date));
//        date.setSeconds(00);
//        System.out.println(sdf.format(date));
    }
}   
