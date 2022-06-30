package com.itheima.demo10_Calendar类;

import java.util.Calendar;

public class Test2_常用方法 {
    public static void main(String[] args) {
        /*
            Calendar类常用方法:
                public int get(int field)  获取某个字段的值。
                public void set(int field,int value)  设置某个字段的值
                public void add(int field,int amount)  为某个字段增加/减少指定的值

                field参数表示获取哪个字段的值，可以使用Calendar中定义的常量来表示。
                 Calendar.YEAR : 年 | Calendar.MONTH ：月 | Calendar.DAY_OF_MONTH：日
                 Calendar.HOUR : 时 | Calendar.MINUTE：分 | Calendar.SECOND：秒
                 Calendar.DAY_OF_WEEK：星期

         */
        // 获取日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println("cal = " + cal);
        /*
            cal = java.util.GregorianCalendar[time=1649045358317,areFieldsSet=true,areAllFieldsSet=true,
            lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,
            useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
            YEAR=2022,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=2,
            DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=9,SECOND=18,MILLISECOND=317,
            ZONE_OFFSET=28800000,DST_OFFSET=0]

         */

        // 获取日历对象中的年字段的值
        int year = cal.get(Calendar.YEAR);
        System.out.println("year = " + year);// 2022

        // 获取日历对象中的月份字段的值
        int month = cal.get(Calendar.MONTH);
        System.out.println("month = " + month);// 3

        // 获取日历对象中的日字段的值
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("day = " + day);// 4

        // 修改年字段的值为2050
        cal.set(Calendar.YEAR,2050);
        System.out.println("修改之后的年: "+cal.get(Calendar.YEAR));// 2050

        // 修改月字段的值为6
        cal.set(Calendar.MONTH,6);
        System.out.println("修改之后的月: "+cal.get(Calendar.MONTH));// 6

        // 为年字段的值增加5
        cal.add(Calendar.YEAR,5);
        System.out.println("增加年份之后的年: "+cal.get(Calendar.YEAR));// 2055

        // 为年字段的值减少10
        cal.add(Calendar.YEAR,-10);
        System.out.println("减少年份之后的年: "+cal.get(Calendar.YEAR));// 2045

    }
}
