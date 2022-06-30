package com.itheima.demo8_序列化和反序列化注意事项;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_反序列化操作 {
    public static void main(String[] args) throws Exception {
        /*
        注意事项
           1.JAVA反序列化对象，如果找不到对应class文件,抛出一个ClassNotFoundException异常。
           2.JAVA反序列化对象，能找到class文件,但是class文件在序列化对象后发生变化,反序列化操作，抛出一个InvalidClassException异常。
              解决方法：Serializable接口给需要序列化的类，提供了一个序列版本号的静态常量SerialVersionUID。
                      该常量的目的在于验证序列化的对象和对应的类是否版本匹配。

         */
        // 1.创建反序列化流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day11\\ddd\\person1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 2.重构对象
        Person p = (Person) ois.readObject();

        // 3.关闭流,释放资源
        ois.close();
        System.out.println("重构的对象"+p);
    }
}
