package com.itheima.demo11_正则表达式的组装;

public class Test2_逻辑运算符 {
    public static void main(String[] args) {
          /*
          语法：
            1. &&：并且
            2. | ：或者
         */
        // 需求:按照如下要求，使用正则表达式，完成字符串内容的验证。
        //1.验证字符串是小写辅音字符开头，后跟ad  除了a,e,i,o,u之外,其他的都是辅音字母
        System.out.println("bad".matches("[a-z&&[^aeiou]]ad"));// true
        System.out.println("aad".matches("[a-z&&[^aeiou]]ad"));// false
        System.out.println("3ad".matches("[a-z&&[^aeiou]]ad"));// false
        System.out.println("----------");

        //2.验证字符串是aeiou中的某个字符开头，后跟ad
        System.out.println("aad".matches("[a|e|i|o|u]ad"));// true
        System.out.println("bad".matches("[a|e|i|o|u]ad"));// false
    }
}

