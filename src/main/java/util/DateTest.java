package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: book-java-for-demo
 * @description: 时间测试类
 * @author: kmmshmily--cuiyong
 * @date: 2020-08-18 10:56
 **/

public class DateTest {
    public static void main(String[] args) {
        try {

            Date date = new Date();
            date.setTime(1600248303000L);
//            System.out.println(System.currentTimeMillis());
            System.out.println( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
//            String startTimeStr = "00:00:00";
//            String endTimeStr = "06:00:00";
//            Date date = new Date();
//            date.setHours(1);
//            System.out.println(isEffectiveDate(new Date(), startTimeStr, endTimeStr, new SimpleDateFormat("HH:mm:ss")));

//            Date nowDate = new Date();
//            System.out.println(nowDate);
//            nowDate.setTime(59);
//            System.out.println(nowDate);
//            Date createEndTime = nowDate;
//            nowDate.setHours(nowDate.getHours()-6);
//            nowDate.setTime(0);
//            Date createStartTime = nowDate;
//            System.out.println(createStartTime);
//            System.out.println(createEndTime);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 判断当前时间是否在指定时间段内
     *
     * @param currentDate  :
     * @param startTimeStr :
     * @param endTimeStr   :
     * @param sdf          :
     * @return boolean
     * @throws
     * @Author kmmshmily
     * @Date 2020/8/18 11:16
     */
    public static boolean isEffectiveDate(Date currentDate, String startTimeStr, String endTimeStr, SimpleDateFormat sdf) throws Exception {

        Date startTime = sdf.parse(startTimeStr);
        Date endTime = sdf.parse(endTimeStr);
        Date nowTime = sdf.parse(sdf.format(currentDate));

        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }
}   
