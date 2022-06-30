package demo6_TCP文件上传程序版本1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        //服务器程序:
        //1.创建ServerSocket对象,指定服务器的端口号
        ServerSocket ss = new ServerSocket(8888);

        //2.调用accept方法，接收请求,建立连接,返回Socket对象
        Socket socket = ss.accept();

        //3.通过Socket获得字节输入流,关联连接通道
        InputStream is = socket.getInputStream();

        //4.创建字节输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day12\\bbb\\hbCopy1.jpg");

        //5.定义一个byte数组,用来存储读取到的字节数据
        byte[] bys = new byte[8192];

        //6.定义一个int变量,用来存储读取到的字节个数
        int len;

        //7.循环读字节数据
        while ((len = is.read(bys)) != -1) {
            //9.在循环中,写字节数据
            fos.write(bys, 0, len);
        }
        //8.关闭流,释放资源
        fos.close();
        socket.close();
        ss.close();//服务器一般不关闭
    }
}
