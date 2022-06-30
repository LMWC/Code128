package com.itheima.demo9_Base64编码和解码;

import java.util.Base64;

public class Test2_Url型 {
    public static void main(String[] args) {
        // 1.获得Url型的编码器
        Base64.Encoder encoder = Base64.getUrlEncoder();

        // 2.对数据进行编码
        String msg = "name=中国?password=123456";
        String s = encoder.encodeToString(msg.getBytes());
        System.out.println("编码后:"+s);

        // 3.获取Url型的解码器
        Base64.Decoder decoder = Base64.getUrlDecoder();

        // 4.对编码之后的数据进行解码
        byte[] bytes = decoder.decode(s);
        System.out.println("解码后:"+new String(bytes));
    }
}
