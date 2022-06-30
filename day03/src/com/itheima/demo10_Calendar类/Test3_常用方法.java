package com.itheima.demo10_Calendar类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test3_常用方法 {
    public static void main(String[] args) throws ParseException {
        /*
            Calendar类常用方法:
                 void setTime(Date date)  使用给定的 Date 设置此 Calendar 的时间。
                  boolean after(Object when) 判断此日历对象是否在指定的日历对象之后
                  boolean before(Object when) 判断此日历对象是否在指定的日历对象之前

         */
        // 获取当前时间的日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println("cal = " + cal);

        // 1.创建一个距离标准基准时间1秒的日期对象
        Date date = new Date(1000);

        // 2.调用Calendar的setTime方法修改日历对象表示的日期
        cal.setTime(date);

        // 3.打印cal日历对象
        System.out.println("cal = " + cal);

        // 获取当前时间的日历对象
        Calendar cal2 = Calendar.getInstance();

        // 判断
        boolean res1 = cal.after(cal2);// false
        boolean res2 = cal.before(cal2);// true
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);

        System.out.println("-------------------");

        // 需求: 获取出生日期的日历对象
        // 1.定义一个字符串类型的出生日期
        String birthdayStr = "1996-10-01";

        // 2.创建SimpleDateFormat对象,指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 3.把String出生日期--->Date出生日期
        Date birthdayDate = sdf.parse(birthdayStr);

        //4.Date出生日期--设置到Calendar对象中
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(birthdayDate);

        //5.打印出生日期的日历对象
        System.out.println("cal3 = " + cal3);

    }
}
