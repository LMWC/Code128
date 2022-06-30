package com.itheima.demo6_Map集合常用方法;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*
            Map接口的方法:
                public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
                public V remove(Object key): 把指定的键所对应的键值对元素在Map集合中删除，返回被删除元素的值。
                public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
                public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
                public  Collection<V> values(); 获取Map集合中所有的值，存储到Collection集合中
                public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
                public boolean containsKey(Object key):判断该集合中是否有此键。
                public boolean containsValue(Object value):判断该集合中是否有此值。
         */
        // 1.创建Map集合,指定键的类型为String,值的类型为String
        Map<String,String> map = new HashMap<>();// 多态,父接口的变量指向实现类的对象

        //public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("谢霆锋", "王菲");
        map.put("李亚鹏", "王菲");
        map.put("文章", "姚笛");
        // map集合的特点: 键唯一,值可以重复,如果键重复了,值就会覆盖
        // map = {文章=姚笛, 谢霆锋=王菲, 李亚鹏=王菲, 黄晓明=杨颖}
        System.out.println("map = " + map);

        //public V remove(Object key): 把指定的键所对应的键值对元素在Map集合中删除，返回被删除元素的值。
        String v1 = map.remove("文章");
        System.out.println("v1 = " + v1);// 姚笛
        // map = {谢霆锋=王菲, 李亚鹏=王菲, 黄晓明=杨颖}
        System.out.println("map = " + map);

        //public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
        String v2 = map.get("谢霆锋");
        System.out.println("v2 = " + v2);// 王菲

        //public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
        Set<String> keys = map.keySet();
        // keys = [谢霆锋, 李亚鹏, 黄晓明]
        System.out.println("keys = " + keys);

        //public  Collection<V> values(); 获取Map集合中所有的值，存储到Collection集合中
        Collection<String> values = map.values();
        // values = [王菲, 王菲, 杨颖]
        System.out.println("values = " + values);

        //public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
        /*
            键值对对象: 是用来封装键值对的,使用Entry<K,V>接口来表示,而Entry接口是Map接口的成员内部接口
            Map.Entry<K,V>类型:  用来表示键值对对象
            注意:
                1.键值对是2个对象,键是一个对象,值是一个对象
                2.键值对对象是一个对象,该对象封装了键值对的键和值
         */
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println("entries = " + entries);

        //public boolean containsKey(Object key):判断该集合中是否有此键。
        boolean res1 = map.containsKey("黄晓明");
        System.out.println("res1 = " + res1);// true

        //public boolean containsValue(Object value):判断该集合中是否有此值。
        boolean res2 = map.containsValue("杨颖");
        System.out.println("res2 = " + res2);// true
    }
}
