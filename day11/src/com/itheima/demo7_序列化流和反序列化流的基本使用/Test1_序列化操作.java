package com.itheima.demo7_序列化流和反序列化流的基本使用;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_序列化操作 {
    public static void main(String[] args) throws Exception{
        /*
    构造方法
       public ObjectOutputStream(OutputStream out);创建一个指定序列化流对象,需要传入一个字节输出流对象
    特有方法
       public final void writeObject(Object obj);将指定的对象以字节方式写出到指定文件

    注意：
       类实现java.io.Serializable标记接口，否则会抛出NotSerializableException。
       属性需要可序列化。如果某属性不想序列化，须注明瞬态transient关键字修饰。
     */
        // 1.创建序列化流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day11\\ddd\\person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 2.创建被序列化的对象
        Person p = new Person("张三",18);

        // 3.序列化操作
        oos.writeObject(p);

        // 4.关闭流,释放资源
        oos.close();
    }
}
