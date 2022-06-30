package demo4_TCP通信程序版本2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

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

        //2.通过Socket对象获得字节输出流，关联连接通道
        OutputStream os = socket.getOutputStream();

        //3.写数据给服务器
        os.write("服务器你好,今晚约吗?".getBytes());

        //4.通过Socket对象获得字节输入流，关联连接额通道
        InputStream is = socket.getInputStream();

        //5.读回写的数据
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println("服务器接收到的数据:"+new String(bys,0,len));

        //5.关闭流,释放资源
        socket.close();
    }
}
