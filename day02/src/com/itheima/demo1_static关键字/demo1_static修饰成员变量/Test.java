package com.itheima.demo1_static关键字.demo1_static修饰成员变量;

public class Test {
    public static void main(String[] args) {
        /*
            static关键字修饰成员变量:
                格式: 修饰符 static 数据类型 变量名;   某个类的成员变量要被该类的所有对象共享就可以使用static修饰该成员变量
                特点:
                    1.被static修饰的成员变量叫做静态成员变量(类变量)
                    2.被static修饰的成员变量是属于类的,会被该类的所有对象共享
                      静态成员是随着类的加载(加载类的class文件到内存中)而加载
                    3.如果该类的某个对象修改了静态变量的值,那么该类的所有对象使用的都是修改后的数据

               访问格式:
                    类名.静态成员变量---------------->推荐
                    对象名.静态成员变量
         */
        // 创建中国人对象
        Chinese c1 = new Chinese("张三", "中国");
        // 张三,中国
        System.out.println(c1.name + "," + c1.country);

        // 创建中国人对象
        Chinese c2 = new Chinese();
        // null,null ----->country加了static修饰之后--->null,中国
        System.out.println(c2.name + "," + c2.country);

        // 通过类名直接访问
        Chinese.country = "中华人民共和国";
        System.out.println(c1.name + "," + c1.country);// 张三,中华人民共和国
        System.out.println(c2.name + "," + c2.country);// null,中华人民共和国
        System.out.println("Chinese.country = " + Chinese.country);// 中华人共和国
    }
}

