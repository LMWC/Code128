package com.itheima.demo6_字节输出流的使用;

import java.io.File;
import java.io.FileOutputStream;

public class Test5_追加续写 {
    public static void main(String[] args) throws Exception{
        /*
        创建输出流对象,之前数据会被清空，想要保留目标文件中原来的数据，需要使用特定的构造方法。
        构造方法：append的值，true表示追加数据，false表示清空原有数据。
        public FileOutputStream(File file,boolean append) 创建文件输出流以写入由指定的File对象表示的文件对象,关联的文件。
        public FileOutputStream(String name,boolean append) 创建文件输出流以指定的名称写入文件。
        注意:
        如果关联的文件不存在,就会自动创建一个新的空文件
        如果关联的文件存在,并且第二个参数设置为true,就不清空源文件中的数据,否则就清空(false)
         */
        // 1.创建一个字节输出流对象,关联目的地文件路径
        //FileOutputStream fos = new FileOutputStream("day10\\bbb\\e.txt",true);
        FileOutputStream fos = new FileOutputStream(new File("day10\\bbb\\ee.txt"),true);

        // 2.写一个字节数组
        byte[] bys = {97,98,99,100,101};
        fos.write(bys,0,2);

        // 关闭流,释放资源
        fos.close();
    }
}
