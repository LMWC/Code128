package com.itheima.demo1_权限修饰符;

public class Test {
    public static void main(String[] args) {
        /*
                                public          protected           默认          private
            同一个类中           √               √                   √             √
            同一个包中           √               √                   √             ×
            不同包的子类         √               √                   ×             ×
            不同包的无关类       √               ×                   ×             ×
         */
        // 同一个包中
        Person p = new Person();
        p.method1();
        p.method2();
        p.method3();
        //p.method4();// 编译报错
    }
}
