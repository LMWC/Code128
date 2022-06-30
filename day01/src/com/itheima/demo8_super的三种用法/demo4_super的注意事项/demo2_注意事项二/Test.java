package com.itheima.demo8_super的三种用法.demo4_super的注意事项.demo2_注意事项二;

class Fu{
    int num;

    public Fu(int num) {
        this.num = num;
    }
}

// 子类编译报错: 因为这里系统会默认为Zi类生成一个空参构造方法,而子类的构造方法如果没有手动调用父类的构造方法，默认会调用父类的空参构造方法,但这里的父类没有空参构造方法
/*class Zi extends Fu{


}*/
public class Test {
    public static void main(String[] args) {
        /*
            子类的构造方法默认会调用父类的空参构造方法,如果父类中没有空参构造方法,只定义了有参构造方法,会编译报错
         */
    }
}
