package com.itheima.demo8_SimpleDateFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        /*
            概述: DateFormat为抽象类，需要使用其子类java.text.SimpleDateFormat创建对象。
            作用: 实现Date和String之间的相互转换
            构造方法:  public SimpleDateFormat(String pattern)：创建日期格式化对象,通过参数传入日期格式
                     参数pattern是一个字符串，代表日期时间的自定义格式。
                     日期格式常见规则:y--年   M--月  d--日  H--时  m--分   s--秒
                     日期格式举例:yyyy-MM-dd HH:mm:ss  或者  yyyy年MM月dd日 HH:mm:ss 或者  yyyy年MM月dd日 ....
            常用方法:
                public String format(Date date)：将Date对象格式化为字符串。
                public Date parse(String source)：将字符串解析为Date对象。

         */
        // 创建日期格式化对象,指定日期格式
        //SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        //SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        //SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // 案例1: Date--->String
        // 1.创建当前日期对象
        Date date = new Date();
        // 2.创建日期格式化对象(SimpleDateFormat)--->格式可以随意指定,符合日期格式规则即可
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // 3.把Date对象按照指定的日期格式转换为String对象
        String dateStr = sdf.format(date);
        System.out.println("dateStr = " + dateStr);

        // 案例2: String---->Date
        // 1.定义一个字符串类型的日期
        String birthday = "1996-10-13";

        // 2.创建日期格式化对象(SimpleDateFormat)-->格式不可以随意指定,日期格式必须和要转换的字符串日期格式一致
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        // 3.把String对象按照指定的日期格式转换为Date对象
        Date dateBirthday = sdf2.parse(birthday);
        System.out.println("dateBirthday = " + dateBirthday);


    }
}
