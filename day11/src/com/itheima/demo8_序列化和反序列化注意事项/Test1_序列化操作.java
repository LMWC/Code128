package com.itheima.demo8_序列化和反序列化注意事项;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_序列化操作 {
    public static void main(String[] args) throws Exception{
        /*
        注意：
           类实现java.io.Serializable标记接口，否则会抛出NotSerializableException。
           属性需要可序列化。如果某属性不想序列化，须注明瞬态transient关键字修饰。
     */
        // 1.创建序列化流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day11\\ddd\\person1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 2.创建被序列化的对象
        Person p = new Person("张三",18);
        p.setPet(new Pet("旺财"));

        // 3.序列化操作
        oos.writeObject(p);

        // 4.关闭流,释放资源
        oos.close();
    }
}
