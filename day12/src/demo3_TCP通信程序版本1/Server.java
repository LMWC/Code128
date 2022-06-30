package demo3_TCP通信程序版本1;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        //1.创建ServerSocket对象,指定服务器的端口号7777
        ServerSocket ss = new ServerSocket(7777);

        //2.调用accept方法，接收客户端的请求,建立连接,返回Socket对象
        Socket socket = ss.accept(); // 会阻塞,直到客户端连接成功
        //System.out.println("server:"+socket);

        //3.通过Socket对象获得字节输入流，关联连接通道
        InputStream is = socket.getInputStream();

        //4.读数据
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println("服务器接收到的数据:"+new String(bys,0,len));

        //5.关闭流,释放资源
        socket.close();
        ss.close();// 一般服务器是不关
    }
}
