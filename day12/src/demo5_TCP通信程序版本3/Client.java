package demo5_TCP通信程序版本3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        /*
        Socket类：
           public Socket(String host, int port);
           public OutputStream getOutputStream();
           public InputStream getInputStream();
           public void close();
         */
        //1.创建Socket对象,指定要连接的服务器的ip地址和端口号
        Socket socket = new Socket("127.0.0.1",7777);
        //System.out.println("client:"+socket);

        //加循环
        while (true){
            //2.通过Socket对象获得字节输出流，关联连接通道
            OutputStream os = socket.getOutputStream();

            //3.写数据给服务器
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个字符串：");
            String msg = sc.nextLine();
            os.write(msg.getBytes());

            //4.通过Socket对象获得字节输入流，关联连接额通道
            InputStream is = socket.getInputStream();

            //5.读回写的数据
            byte[] bys = new byte[1024];
            int len = is.read(bys);
            System.out.println("客户端接收到的数据:"+new String(bys,0,len));

            //5.关闭流,释放资源
            //socket.close();
        }
    }
}
