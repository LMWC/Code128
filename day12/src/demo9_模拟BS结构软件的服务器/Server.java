package demo9_模拟BS结构软件的服务器;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        //服务器程序：
        //1.创建ServerSocket对象,指定服务器的端口号
        ServerSocket ss = new ServerSocket(9999);

        //循环接收请求
        while (true){
            //2.调用accept方法，接收请求,建立连接,得到Socket对象
            Socket socket = ss.accept();

            //开启线程，响应页面和图片数据
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //3.读取请求数据
                        InputStream is = socket.getInputStream();
                        //byte[] bys = new byte[8192];
                        //int len = is.read(bys);
                        //System.out.println(new String(bys,0,len));
                        InputStreamReader isr = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(isr);
                        String line = br.readLine();
                        System.out.println("line:"+line);

                        //4.从读取到的请求数据中筛选出请求路径
                        //String[] arr = line.split(" ");
                        //String s = arr[1];
                        //String path = s.substring(1);//访问页面路径
                        String path = line.split(" ")[1].substring(1);
                        System.out.println("path:"+path);

                        //5.创建字节输入流对象,关联请求页面的路径
                        FileInputStream fis = new FileInputStream(path);

                        //6.通过Socket对象获得字节输出流,关联连接通道
                        OutputStream os = socket.getOutputStream();

                        //7.定义一个byte数组,用来存储读取到的字节数据
                        byte[] bys = new byte[8192];

                        //7.定义一个int变量,用来存储读取到的字节个数
                        int len;

                        //8.循环读字节数据
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        os.write("\r\n".getBytes());

                        while ((len = fis.read(bys)) != -1) {
                            //9.在循环中,写出字节数据
                            os.write(bys,0,len);
                        }
                        //10.关闭流,释放资源
                        fis.close();
                        socket.close();
                    }catch (Exception e){
                        //e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
