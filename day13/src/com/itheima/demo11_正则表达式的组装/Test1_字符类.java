package com.itheima.demo11_正则表达式的组装;

public class Test1_字符类 {
    public static void main(String[] args) {
          /*
            语法---[]： 匹配单个字符，-：表示范围，^：表示取反
               [abc]：a、b或c（简单类）
               [^abc]：任何字符，除了a、b或c（否定）
               [a-zA-Z]：a到z或A到Z，两头的字母包括在内（范围）
               [a-d[m-p]]：a到d或m到p：[a-dm-p]（并集）
               [a-z&&[def]]：d、e或f（交集）
               [a-z&&[^bc]]：a到z，除了b和c：[ad-z]（减去）
               [a-z&&[^m-p]]：a到z，而非m和p：[a-lq-z]（减去）
         */
        // 需求:按照如下要求，使用正则表达式，完成字符串内容的验证。
        // 1.验证str是否以h开头，以d结尾，中间是a,e,i,o,u中某个字符
        System.out.println("had".matches("h[aeiou]d"));// true
        System.out.println("hbd".matches("h[aeiou]d"));// false
        System.out.println("hea".matches("h[aeiou]d"));// false
        System.out.println("aed".matches("h[aeiou]d"));// false
        System.out.println("---------");

        // 2.验证str是否以h开头，以d结尾，中间不是a,e,i,o,u中的某个字符
        System.out.println("had".matches("h[^aeiou]d"));// false
        System.out.println("hbd".matches("h[^aeiou]d"));// true
        System.out.println("hea".matches("h[^aeiou]d"));// false
        System.out.println("aed".matches("h[^aeiou]d"));// false
        System.out.println("---------");

        // 3.验证str是否a-z的任何一个小写字符开头，后跟ad
        System.out.println("aad".matches("[a-z]ad"));// true
        System.out.println("Aad".matches("[a-z]ad"));// false
        System.out.println("aab".matches("[a-z]ad"));// false
        System.out.println("---------");

        // 4.验证str是否以a-d或者m-p之间某个字符开头，后跟ad
        System.out.println("aad".matches("[a-dm-p]ad"));// true
        System.out.println("cad".matches("[a-dm-p]ad"));// true
        System.out.println("dad".matches("[a-dm-p]ad"));// true
        System.out.println("mad".matches("[a-dm-p]ad"));// true
        System.out.println("nad".matches("[a-dm-p]ad"));// true
        System.out.println("pad".matches("[a-dm-p]ad"));// true
        System.out.println("zad".matches("[a-dm-p]ad"));// false
        System.out.println("aaz".matches("[a-dm-p]ad"));// false
        System.out.println("---------");
    }
}

