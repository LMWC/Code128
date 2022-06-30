package demo1_InetAdress类;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        /*
    InetAddress类，此类表示Internet协议（IP）地址。
    获取InetAddress对象
       static InetAddress getLocalHost()   获得本地主机IP地址对象
       static InetAddress getByName(String host) 根据主机名获得对应的IP地址对象
    常用方法
       String getHostName();根据InetAddress对象获得主机名
       String getHostAddress();根据InetAddress对象获得IP地址字符串
     */
        //获得本地的IP地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println("ip1:" + ip1);//ip1:MSI-GE72-6QF/192.168.18.34
        InetAddress ip2 = InetAddress.getByName("MSI-GE72-6QF");
        System.out.println("ip2:" + ip2);//ip2:MSI-GE72-6QF/10.254.3.49

        System.out.println("获得主机名:"+ip1.getHostName());//获得主机名:MSI-GE72-6QF
        System.out.println("获得ip地址:"+ip1.getHostAddress());//获得ip地址:10.254.3.49
    }

}
