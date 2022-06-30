package demo3_TCP通信程序版本1;

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

        //4.关闭流,释放资源
        //os.close();
        //关闭socket就会自动关闭通过Socket获得的流
        //关闭通过socket获得的流也会自动关闭Socket
        socket.close();
    }
}
