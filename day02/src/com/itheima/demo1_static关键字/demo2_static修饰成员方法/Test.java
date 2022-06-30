package com.itheima.demo1_static关键字.demo2_static修饰成员方法;

public class Test {
    public static void main(String[] args) {
        /*
            定义格式:
                修饰符 static 返回值类型 方法名 (参数列表){
                    // 执行语句
                }；
            使用格式:
                类名.静态方法名(参数)；------>推荐
                对象名.静态方法名(参数)

         */
        // 创建中国人对象
        Chinese c = new Chinese();
        //访问方法
        c.method();
        c.show();
        Chinese.show();
    }
}
