package javase;

import com.alibaba.fastjson.JSON;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 */
public class AppSortTest {
    public static void main(String[] args) throws Exception {
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
////        Date date = new Date(Long.valueOf("637404641222400000"));
//////        Date date = format.parse("202005160101");
////        System.out.println(date);
//
//        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
////        Date date = new Date(Long.valueOf("637404641222400000"));
//        Date date = format.parse("20200516");
//        System.out.println(format1.format(date));
//        System.out.println(date);
//
//        String str = "202005160101".substring(0, 7);
//
//        NumberFormat nt = NumberFormat.getPercentInstance();//获取格式化对象
////        nt.setMinimumFractionDigits(0);//设置百分数精确度2即保留两位小数
//
//        NumberFormat.getPercentInstance().format(Double.valueOf("0.8"));

        List<Date> dates = new ArrayList<>();
        Date d1 = new Date();
        Thread.sleep(1000);
        Date d2 = new Date();
        Thread.sleep(1000);
        Date d3 = new Date();
        Thread.sleep(1000);
        dates.add(d3);
        dates.add(d2);
        dates.add(d1);
        System.out.println(JSON.toJSONString(dates));
        Collections.sort(dates, (t1, t2) -> {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                if (t1.getTime() < t2.getTime()) {
                    return -1;
                } else if (t1.getTime() > t2.getTime()) {
                    return 1;
                } else {
                    return 0;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return 0;
        });
        System.out.println(JSON.toJSONString(dates));
    }
}
