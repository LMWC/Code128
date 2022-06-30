package com.itheima.demo10_正则表达式的体验;

public class Test {
    public static void main(String[] args) {
        /*
        boolean matches(String regex)告知此字符串是否匹配给定的正则表达式
         */
        System.out.println(checkQQ1("12345678"));// true
        System.out.println(checkQQ1("12345a78"));// false
        System.out.println(checkQQ1("02345678"));// false
        System.out.println(checkQQ1("1234"));// false
        System.out.println("----------");
        System.out.println(checkQQ2("12345678"));// true
        System.out.println(checkQQ2("12345a78"));// false
        System.out.println(checkQQ2("02345678"));// false
        System.out.println(checkQQ2("1234"));// false
    }

    /**
     * 使用if校验输入的qq号码是否符合规则
     * @param qq
     * @return
     */
    public static boolean checkQQ1(String qq) {
        //规则1：QQ号码必须是5--15位长度-->只要长度不是[5,15],就直接返回false结束方法
        if (qq.length() < 5 || qq.length() > 15) {
            return false;
        }

        //规则2：而且必须全部是数字-->只要有任何一位不是数字,就直接返回false结束方法
        for (int i = 0; i < qq.length(); i++) {
            //获取字符
            char c = qq.charAt(i);
            //判断字符
            if (c < '0' || c > '9'){
                return false;
            }
        }

        //规则3：而且首位不能为0--->只要首位为0字符,就直接返回false结束方法
        if (qq.charAt(0) == '0'){
            return false;
        }

        //说明符合规则
        return true;
    }

    /**
     * 使用正则表达式校验输入的qq号码是否符合规则
     * @param qq
     * @return
     */
    public static boolean checkQQ2(String qq){
        return qq.matches("[1-9]\\d{4,14}");
    }
}
