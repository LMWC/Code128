package demo12_ServerSocketChannel和SocketChannel;

import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class Client {
    public static void main(String[] args) throws Exception{
        // 1.打开客户端通道
        SocketChannel sc = SocketChannel.open();

        // 2.调用connect()连接方法
        sc.connect(new InetSocketAddress("127.0.0.1",6666));

        System.out.println("连接成功..");
    }
}

