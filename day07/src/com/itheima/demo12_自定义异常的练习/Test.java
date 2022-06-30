package com.itheima.demo12_自定义异常的练习;

import java.util.Scanner;

public class Test {
    // 已注册的用户名
    public static String[] arr = {"jack", "rose", "lily", "lucy"};

    public static void main(String[] args) {
        // 需求:模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册
        //键盘录入要注册的用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要注册的用户名:");
        String username = sc.next();

        // 判断该用户名是否已经被注册
        boolean res = checkUsername(username);
        if (res == false) {
            System.out.println("该用户名没有被注册");
        }
    }

    // 定义一个方法,用于校验用户名是否已经注册,注册了产生异常,没有注册返回false
    public static boolean checkUsername(String username) {
        // 循环遍历已注册的用户名
        for (String name : arr) {
            // 拿录入的用户名和已注册的用户名进行一一比较
            if (name.equals(username)) {
                // 说明已经被注册过了,抛出异常
                throw new RegisterException(username + " 亲，该用户名已经被注册");
            }
        }

        // 循环结束意味着没有找到已注册的用户名---该用户名没有被注册
        return false;
    }
}
