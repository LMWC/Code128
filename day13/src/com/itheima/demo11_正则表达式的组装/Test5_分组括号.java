package com.itheima.demo11_正则表达式的组装;

public class Test5_分组括号 {
    public static void main(String[] args) {
          /*
            分组括号: ()
            使用:格式相同的就分为一组
         */
        String str = "DG8FV-B9TKY-FRT9J-99899-XPQ4G";
        System.out.println(str.matches("([A-Z0-9]{5}-){4}[A-Z0-9]{5}"));// true
        System.out.println("----------");

        //分组括号扩展：匹配叠词
        //开开心心，快快乐乐,...aabb格式
        //\\1表示第一组  \\2表示第二组
        System.out.println("开开心心".matches("(.)\\1(.)\\2"));// true
        System.out.println("快快乐乐".matches("(.)\\1(.)\\2"));// true
        System.out.println("abcd".matches("(.)\\1(.)\\2"));// false
        System.out.println("----------");

        //哈哈哈嘿嘿嘿,...aaabbb格式
        System.out.println("哈哈哈嘿嘿嘿".matches("(.)\\1{2}(.)\\2{2}"));// true
        System.out.println("aaabbb".matches("(.)\\1{2}(.)\\2{2}"));// true
        System.out.println("abcdef".matches("(.)\\1{2}(.)\\2{2}"));// false
        System.out.println("----------");

        // aabbcc格式
        System.out.println("aabbcc".matches("(.)\\1(.)\\2(.)\\3"));// true
        System.out.println("abcdef".matches("(.)\\1(.)\\2(.)\\3"));// false
    }
}

