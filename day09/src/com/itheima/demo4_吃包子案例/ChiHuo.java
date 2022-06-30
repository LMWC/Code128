package com.itheima.demo4_吃包子案例;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 11:08
 */
public class ChiHuo extends Thread {

    BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                // 包子没有了,进入无限等待
                if (bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 包子有了,执行代码(吃包子),唤醒其他线程,修改旗帜变量
                if (bz.flag == true){
                    System.out.println("吃货线程:开始吃包子,包子的馅儿:"+bz.xian);
                    bz.flag = false;
                    bz.notify();
                    System.out.println("吃货线程:包子吃完了,包子铺快来做包子========");
                }
            }
        }
    }
}
