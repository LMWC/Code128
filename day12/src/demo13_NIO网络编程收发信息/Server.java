package demo13_NIO网络编程收发信息;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Server {
    public static void main(String[] args) throws Exception{
        // 1.打开服务器通道
        ServerSocketChannel ssc = ServerSocketChannel.open();

        // 2.绑定端口号
        ssc.bind(new InetSocketAddress(6666));

        // 3.建立连接
        SocketChannel sc = ssc.accept();

        // 4.读客户端写过来的数据
        ByteBuffer b = ByteBuffer.allocate(1024);
        int len = sc.read(b);
        System.out.println(new String(b.array(),0,len));

        // 5.释放资源
        ssc.close();
    }
}

