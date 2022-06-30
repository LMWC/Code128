package com.itheima.demo10_Calendar类;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1_概述 {
    public static void main(String[] args) {
        /*
            概述: Calendar类是一个抽象类,用来表示日历
            构造方法:Calendar类是一个抽象类，可以使用它的子类：java.util.GregorianCalendar类
                    方式一:通过GregorianCalendar无参构造创建对象；
                    方式二:通过Calendar的静态方法getInstance()方法获取Calendar日历对象
                            public static Calendar getInstance()   获取一个Calendar日历对象
             注意事项：
                日历对象中的星期是从1-7来表示，1表示星期天。
                日历对象中的月份是从0-11来表示，0表示一月份。
         */
        // 方式一:
        GregorianCalendar cal1 = new GregorianCalendar();
        System.out.println("cal1 = " + cal1);

        // 方式二:
        Calendar cal2 = Calendar.getInstance();
        System.out.println("cal2 = " + cal2);
        /*
            cal2 = java.util.GregorianCalendar[time=1649044683520,areFieldsSet=true,areAllFieldsSet=true,
            lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,
            useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
            YEAR=2022,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=2,
            DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=58,SECOND=3,MILLISECOND=520,
            ZONE_OFFSET=28800000,DST_OFFSET=0]

         */
    }
}
