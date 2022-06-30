package demo12_ServerSocketChannel和SocketChannel;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Server {
    public static void main(String[] args) throws Exception{
        // 1.打开服务器通道
        ServerSocketChannel ssc = ServerSocketChannel.open();

        // 2.绑定端口号
        ssc.bind(new InetSocketAddress(6666));

        // 3.等待客户端连接,接收请求,建立连接
        SocketChannel sc = ssc.accept();
        System.out.println("服务器:连接成功...");
    }
}

