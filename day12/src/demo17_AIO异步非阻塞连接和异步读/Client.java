package demo17_AIO异步非阻塞连接和异步读;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Client {
    public static void main(String[] args) throws Exception{
        // 1.打开客户端通道
        SocketChannel sc = SocketChannel.open();

        // 2.调用connect()连接方法
        sc.connect(new InetSocketAddress("127.0.0.1",7777));

        // 3.写数据
        byte[] bytes = "服务器你好,今晚约吗?".getBytes();
        //ByteBuffer b = ByteBuffer.wrap(bytes);
        ByteBuffer b = ByteBuffer.allocate(1024);
        b.put(bytes);
        b.flip();// position:0,limit:position

        sc.write(b);

        // 4.释放资源
        sc.close();

    }
}

