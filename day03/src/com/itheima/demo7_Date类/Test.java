package com.itheima.demo7_Date类;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        /*
            概述: java.util.Date类 表示特定的瞬间，精确到毫秒。表示自从标准基准时间（称为“历元（epoch）”，即1970年1月1日00:00:00 GMT）以来的指定毫秒数。
            构造方法:
                public Date()：创建当前系统日期对象。
                public Date(long date)：创建距离标准基准时间指定毫秒对应的日期对象。
            常见功能:
                public long getTime() 获取日期对象距离标准基准时间的毫秒值。
                public void setTime(long time) 把方法参数给定的毫秒值设置给日期对象(修改日期)
                boolean after(Date when) 测试此日期是否在指定日期之后
                boolean before(Date when) 测试此日期是否在指定日期之前。
         */
        // 创建当前系统时间的日期对象
        Date date1 = new Date();
        System.out.println("date1 = " + date1);

        // 创建距离标准基准时间1秒的日期对象
        Date date2 = new Date(1000);
        System.out.println("date2 = " + date2);

        // 创建当前系统时间日期对象
        Date date3 = new Date();
        System.out.println("date3 = " + date3);
        // 修改date3表示为距离标准基准时间1秒的日期对象
        date3.setTime(1000);
        System.out.println("date3 = " + date3);

        // 获取date1日期对象距离标准基准时间的毫秒值
        // 获取date2日期对象距离标准基准时间的毫秒值
        System.out.println(date1.getTime());// 很大的数
        System.out.println(date2.getTime());// 1000

        // 比较日期
        boolean res1 = date1.after(date2);// date1表示的日期是否在date2日期之后
        boolean res2 = date1.before(date2);// date1表示的日期是否在date2日期之前
        System.out.println("res1 = " + res1);// true
        System.out.println("res2 = " + res2);// false
    }
}
