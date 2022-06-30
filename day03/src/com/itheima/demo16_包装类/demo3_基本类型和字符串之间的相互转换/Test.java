package com.itheima.demo16_包装类.demo3_基本类型和字符串之间的相互转换;

public class Test {
    public static void main(String[] args) {
        /*
            基本类型转换为String
                方式一：直接使用基本类型的数据加上一个空字符串 `数据+""`
                方式二：通过String类静态方法valueOf(Xxx)
         */
        //方式一：直接使用基本类型的数据加上一个空字符串 `数据+""`
        String str1 = 10 + "";
        String str2 = 3.14 + "";
        String str3 = true + "";
        String str4 = 'a' + "";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);

        // 方式二：通过String类静态方法valueOf(Xxx)
        String s1 = String.valueOf(10);
        String s2 = String.valueOf(3.14);
        String s3 = String.valueOf(true);
        String s4 = String.valueOf('a');
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
    }
}
