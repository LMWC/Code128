package com.itheima.demo12_正则表达式的练习;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
    public String[] split(String regex)//将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。
    public String replaceAll(String regex,String newStr)//将当前字符串中匹配regex正则表达式的字符串替换为newStr。
     */
        //需求：使用String中的split方法，将字符串“18   4  567         99      56”以空格间隔进行分割
        String str1 = "18  4 567      99    56";
        //String[] arr1 = str1.split(" +");
        String[] arr1 = str1.split("\\s+");
        for (String s : arr1) {
            System.out.println("s:"+s);
        }
        System.out.println("-----------");

        String str2 = "itheima-itcast-java";
        String[] arr2 = str2.split("-");
        for (String s : arr2) {
            System.out.println("s:"+s);
        }

        System.out.println("-----------");

        //需求：使用String中的replaceALL方法，将字符串“jfdk432jfdk24354j47jk5l31324”中的数字使用*进行替换
        String str3 = "jfdk432jfdk24354j47jk5l31324";
        String s = str3.replaceAll("\\d","*");
        System.out.println("s:"+s);

        System.out.println("-----------");

        //过滤不文明用语或者敏感词汇
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String msg = sc.nextLine();
        msg = msg.replaceAll("sb|草|艹|妈的|靠|cmd", "***");
        System.out.println("你数日的信息是:" + msg);

    }
}
