package demo18_扩展_连接后多次读取数据;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Client1 {
    public static void main(String[] args) throws Exception{
        // 1.打开通道
        SocketChannel sc = SocketChannel.open();

        // 2.发送连接
        sc.connect(new InetSocketAddress("127.0.0.1",6666));

        Thread.sleep(1000);

        // 3.发送数据
        // 创建ByteBuffer缓冲数组
        ByteBuffer b = ByteBuffer.allocate(1024);
        // 添加数据到缓冲数组
        b.put("服务器你好,今晚约吗??".getBytes());
        // 重置
        b.flip();
        sc.write(b);// 注意:写的是position到limit之间的数据
        b.clear();

        b.put("哈哈哈哈".getBytes());
        b.flip();
        sc.write(b);

        // 4.释放资源
        sc.close();
    }
}

