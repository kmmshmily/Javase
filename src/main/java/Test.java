import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: book-java-for-demo
 * @description: 测试
 * @author: kmmshmily--cuiyong
 * @date: 2020-06-16 17:28
 **/

public class Test {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(LocalDate.parse(new Date().toString()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        String timeStr = "2020-06-19 02:00:00";
        System.out.println(calcCurrentTimeToTargetTime(sdf.parse(timeStr)));
        System.out.println(calcCurrentTimeToTargetTime(new Date()));
//        Date date = new Date();
//        date.setHours(3);
//        date.setMinutes(0);
//        date.setSeconds(0);
//        System.out.println(sdf.format(date));
    }

    /**
     * 获取当前时间到凌晨3点的秒数
     *
     * @param date :
     * @return java.util.Date
     * @throws
     * @Author kmmshmily
     * @Date 2020/6/16 17:37
     */
    public static long calcCurrentTimeToTargetTime(Date date) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");//设置日期格式
        Date now = sdf.parse(sdf.format(date));
        Date beginTime = sdf.parse("00:00:00");
        Date endTime = sdf.parse("03:00:00");

        if (now.after(beginTime) && now.before(endTime)) {
            adaptDate(endTime, date.getYear(), date.getMonth(), date.getDate());
            return (endTime.getTime() - date.getTime())/1000;
        } else {
            adaptDate(endTime, date.getYear(), date.getMonth(), date.getDate() + 1);
            long dateSeconds = date.getTime()/1000;
            long endTimeSeconds = endTime.getTime()/1000;
            return endTimeSeconds - dateSeconds;
        }
    }


    /**
     * 给指定时间设定年月日(存在过时方法， 但为弃用)
     *
     * @param date
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static void adaptDate(Date date, int year, int month, int day) {
        date.setYear(year);
        date.setMonth(month);
        date.setDate(day);
    }
}   
