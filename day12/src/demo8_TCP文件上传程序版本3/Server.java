package demo8_TCP文件上传程序版本3;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        /*
        优化：
           1.文件名的优化
           2.循环接收请求，建立连接
           3.开启线程接收上传文件的数据
         */
        //服务器程序:
        //1.创建ServerSocket对象,指定服务器的端口号
        ServerSocket ss = new ServerSocket(8888);

        //加循环：循环接收请求，建立连接
        while (true){
            //2.调用accept方法，接收请求,建立连接,返回Socket对象
            Socket socket = ss.accept();

            //连接建立之后，开启线程进行上传文件
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //3.通过Socket获得字节输入流,关联连接通道
                        InputStream is = socket.getInputStream();

                        //4.创建字节输出流对象,关联目的地文件路径
                        FileOutputStream fos = new FileOutputStream("day12\\bbb\\"+System.currentTimeMillis()+".jpg");

                        //5.定义一个byte数组,用来存储读取到的字节数据
                        byte[] bys = new byte[8192];

                        //6.定义一个int变量,用来存储读取到的字节个数
                        int len;

                        //7.循环读字节数据
                        System.out.println("server：开始接收...");
                        while ((len = is.read(bys)) != -1) {//卡
                            //8.在循环中,写字节数据
                            fos.write(bys, 0, len);
                        }
                        System.out.println("server：文件的字节数据全部接收完毕");

                        //9.通过Socket获得字节输出流，关联连接通道
                        OutputStream os = socket.getOutputStream();

                        //10.回写上传成功的信息给客户端
                        os.write("文件上传成功!".getBytes());

                        //11.关闭流,释放资源
                        fos.close();
                        socket.close();
                        //ss.close();//服务器一般不关闭
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();


        }
    }
}
