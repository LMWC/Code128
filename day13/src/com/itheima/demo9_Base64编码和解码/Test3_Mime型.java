package com.itheima.demo9_Base64编码和解码;

import java.util.Base64;

public class Test3_Mime型 {
    public static void main(String[] args) {
        // 1.获得Mime型的编码器
        Base64.Encoder encoder = Base64.getMimeEncoder();

        // 2.对数据进行编码
        String msg = "";
        for (int i = 0; i <= 100; i++) {
            msg += i;
        }
        String s = encoder.encodeToString(msg.getBytes());
        System.out.println("编码后:"+s);

        // 3.获取Mime型的解码器
        Base64.Decoder decoder = Base64.getMimeDecoder();

        // 4.对编码之后的数据进行解码
        byte[] bytes = decoder.decode(s);
        System.out.println("解码后:"+new String(bytes));
    }
}
