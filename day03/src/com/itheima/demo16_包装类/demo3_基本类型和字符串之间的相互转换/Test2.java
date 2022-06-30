package com.itheima.demo16_包装类.demo3_基本类型和字符串之间的相互转换;

public class Test2 {
    public static void main(String[] args) {
        /*
            字符串转换为基本类型:
                Byte类:
                    static Byte valueOf(String s)
                    static byte parseByte(String s)
               Short类:
                    static Short valueOf(String s)
                    static short parseShort(String s)
               Integer类:
                    static Integer valueOf(String s)
                    static int parseInt(String s)
              Long类:
                    static Long valueOf(String s)
                    static long parseLong(String s)
             Float类:
                   static Float valueOf(String s)
                    static float parseFloat(String s)
             Double类:
                   static Double valueOf(String s)
                   static double parseDouble(String s)
             Character类: 没有以上类似的方法
                   String转char类型不能使用上述转换方式，只能使用String对象.charAt(0)：
         */
        //字符串转换为基本类型:
        byte b1 = Byte.valueOf("12");// 右边返回的是Byte类的对象,赋值的时候会自动拆箱转换为基本类型的byte
        byte b2 = Byte.parseByte("12");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        short s = Short.parseShort("150");
        int i = Integer.parseInt("712345");
        long l = Long.parseLong("2212345678");
        float f = Float.parseFloat("3.14");
        double d = Double.parseDouble("3.14");
        boolean flag = Boolean.parseBoolean("true");
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("flag = " + flag);

    }
}
