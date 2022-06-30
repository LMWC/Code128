package com.itheima.demo2_Properties类;

import java.util.Properties;
import java.util.Set;

public class Test1_基本使用 {
    public static void main(String[] args) {
        /*
        概述
          java.util.Properties继承于Hashtable，表示一个持久的属性集。
          它使用键值结构存储数据，每个健及其对应值都是一个字符串。

        构造方法 public Properties()：创建一个空的属性列表。
        常用方法
        public Object setProperty(String key, String value) 保存一对属性。
        public String getProperty(String key)  使用此属性列表中指定的键搜索属性值。
        public Set<String> stringPropertyNames() 所有键的名称的集合。
         */
        // 1.创建一个属性集（Properties对象）
        Properties pro = new Properties();

        // 2.存储键值对
        pro.setProperty("k1", "v1");
        pro.setProperty("k2", "v2");
        pro.setProperty("k3", "v3");
        pro.setProperty("k4", "v4");

        // 3.获取所有的键
        Set<String> keys = pro.stringPropertyNames();

        // 4.循环遍历所有的键
        for (String key : keys) {
            // 5.根据键找值
            String value = pro.getProperty(key);
            System.out.println(key+","+value);
        }
    }
}
