package demo18_扩展_连接后多次读取数据;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class Server {
    public static void main(String[] args) throws Exception {
        // 获得异步的服务器通道
        AsynchronousServerSocketChannel assc = AsynchronousServerSocketChannel.open();

        // 绑定端口号
        assc.bind(new InetSocketAddress(6666));

        // 异步:接收客户端请求
        System.out.println(1);
        assc.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            @Override
            public void completed(AsynchronousSocketChannel asc, Object attachment) {
                // 参数1:连接成功之后返回的异步客户端通道
                // 参数2:可以忽略,null
                // 回调方法---成功
                System.out.println(3);
                // 读数据
                ByteBuffer b = ByteBuffer.allocate(1024);
                asc.read(b, null, new CompletionHandler<Integer, Object>() {
                    @Override
                    public void completed(Integer len, Object attachment) {
                        // 参数1:read方法读取到的字节个数
                        // 读取成功
                        System.out.println(5);

                        // 如果读完了,就结束读
                        if (len == -1) {
                            try {
                                asc.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            return;
                        }

                        System.out.println(new String(b.array(), 0, len));

                        // 还原缓冲数组,供下一次使用
                        b.clear();
                        // 递归调用 继续读
                        asc.read(b, null, this);
                    }

                    @Override
                    public void failed(Throwable exc, Object attachment) {
                        // 读取失败
                        System.out.println(6);
                    }

                });
                System.out.println(7);
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                // 回调方法---失败
                System.out.println(4);
            }
        });

        System.out.println(2);

        while (true) {

        }

        // 1,2,3,7,5,---数据
    }
}

