package demo6_TCP文件上传程序版本1;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        //客户端程序:
        //1.创建Socket对象,指定要连接的服务器的ip地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);

        //2.创建字节输入流对象,关联数据源文件路径（上传的文件）
        FileInputStream fis = new FileInputStream("day12\\aaa\\hb.jpg");

        //3.通过Socket获得字节输出流,关联连接通道
        OutputStream os = socket.getOutputStream();

        //4.定义一个byte数组,用来存储读取到的字节数据
        byte[] bys = new byte[8192];

        //5.定义一个int变量,用来存储读取到的字节个数
        int len;

        //6.循环读字节数据
        while ((len = fis.read(bys)) != -1) {
            //7.在循环中,写字节数据
            os.write(bys,0,len);
        }
        //8.关闭流,释放资源
        fis.close();
        socket.close();
    }
}
