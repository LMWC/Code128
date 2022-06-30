package demo5_TCP通信程序版本3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception{
        //1.创建ServerSocket对象,指定服务器的端口号7777
        ServerSocket ss = new ServerSocket(7777);

        //2.调用accept方法，接收客户端的请求,建立连接,返回Socket对象
        Socket socket = ss.accept(); // 会阻塞,直到客户端连接成功
        //System.out.println("server:"+socket);

        //加循环
        while (true){
            //3.通过Socket对象获得字节输入流，关联连接通道
            InputStream is = socket.getInputStream();

            //4.读数据
            byte[] bys = new byte[1024];
            int len = is.read(bys);
            System.out.println("服务器接收到的数据:"+new String(bys,0,len));

            //5.通过Socket对象获得字节输出流，关联连接额通道
            OutputStream os = socket.getOutputStream();

            //6.回写数据给客户端
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个字符串：");
            String msg = sc.nextLine();
            os.write(msg.getBytes());

            //7.关闭流,释放资源
            //socket.close();
            //ss.close();// 一般服务器是不关
        }
    }
}
