package demo2_UDP通信程序;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws Exception{
        /*
        public DatagramPacket(byte[] buf, int length,
               InetAddress address, int port):封装要发送的数据以及接收端的IP和端口号
        public DatagramSocket()
        public void send(DatagramPacket p);发送数据包
         */
        //1.定义要发送的数据
        String msg = "你好，今晚约吗？";
        byte[] bytes = msg.getBytes();

        //2.创建数据包对象，封装要发送的数据
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),6666);

        //3.创建DatagramSocket对象
        DatagramSocket socket = new DatagramSocket();//随机分配端口号

        //4.发送数据包
        socket.send(packet);

        //5.关闭流，释放资源
        socket.close();
    }
}
