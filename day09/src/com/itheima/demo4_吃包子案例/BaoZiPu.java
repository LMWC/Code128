package com.itheima.demo4_吃包子案例;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 11:08
 */
public class BaoZiPu extends Thread {

    BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                // 包子有了,进入无限等待
                if (bz.flag == true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 包子没有了,执行代码(生产包子),唤醒其他线程,修改旗帜变量
                if (bz.flag == false){
                    System.out.println("包子铺线程:开始做包子...");
                    bz.xian = "韭菜馅儿";
                    bz.flag = true;
                    bz.notify();
                    System.out.println("包子铺线程:包子做好了,吃货快来吃包子...");
                }

            }
        }
    }
}
