package demo2_UDP通信程序;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception{
        /*
        public DatagramPacket(byte[] buf, int length)
        public synchronized int getLength() 获取实际接收到的字符数据
        public DatagramSocket(int port);
        public synchronized void receive(DatagramPacket p)接收数据包
         */
        //1.创建数据包对象，用来接收发送端发过来的数据
        byte[] bys = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bys,bys.length);

        //2.创建DatagramSocket对象，指定端口号6666
        DatagramSocket socket = new DatagramSocket(6666);

        //3.接收数据包
        socket.receive(packet);

        //4.打印输出，关闭流，释放资源
        socket.close();
        System.out.println("接收到的数据："+new String(bys,0,packet.getLength()));
    }
}
