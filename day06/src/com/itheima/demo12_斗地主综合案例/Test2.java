package com.itheima.demo12_斗地主综合案例;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        //1.造牌
        //1.1 创建一个Map集合,键的类型为Integer(标记),值的类型为String(牌)
        HashMap<Integer, String> map = new HashMap<>();

        //1.2 定义一个花色集合,用来存储4个花色
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors, "♠", "♥", "♣", "♦");

        //1.3 定义一个牌面值集合,用来存储13个牌面值
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //1.4 定义一个标记,初始值为0
        int mark = 0;

        //1.5 标记为键,大王为值,存储到map集合中,然后标记+1
        map.put(mark++, "大王");

        //1.6 标记为键,小王为值,存储到map集合中,然后标记+1
        map.put(mark++, "小王");

        //1.7 花色集合和牌面值集合循环嵌套,造剩余的52张牌
        for (String number : numbers) {
            for (String color : colors) {
                //1.8 在循环中,拼接扑克牌,存储到map集合中
                String pai = color + number;
                map.put(mark++, pai);
            }
        }
        System.out.println("map = " + map);

        //2.洗牌
        //2.1 获取所有的标记
        Set<Integer> markSet = map.keySet();

        //2.2 把所有的标记存储到一个List集合中
        ArrayList<Integer> markList = new ArrayList<>();
        markList.addAll(markSet);// 把markSet集合中所有的元素存储到markList集合中

        //2.3 打乱所有标记的顺序
        Collections.shuffle(markList);
        System.out.println("markList = " + markList);
        System.out.println("markList = " + markList.size());


        //3.发牌
        //3.1 创建4个TreeMap集合,分别用来存储玩家1,玩家2,玩家3,底牌的标记和牌
        TreeMap<Integer,String> play1 = new TreeMap<>();
        TreeMap<Integer,String> play2 = new TreeMap<>();
        TreeMap<Integer,String> play3 = new TreeMap<>();
        TreeMap<Integer,String> diPai = new TreeMap<>();

        //3.2 循环遍历打乱顺序之后的标记
        for (int i = 0; i < markList.size(); i++) {
            //3.3 在循环中,获取标记
            Integer paiMark = markList.get(i);
            //3.3 根据标记去取牌
            String pai = map.get(paiMark);

            if (i >= 51) {
                //3.4 如果标记的索引>=51,该标记就给底牌
                 diPai.put(paiMark,pai);
            }else if (i % 3 == 0) {
                //3.4 如果标记的索引%3==0,该标记就给玩家1
                play1.put(paiMark,pai);
            }else if (i % 3 == 1) {
                //3.4 如果标记的索引%3==1,该标记就给玩家2
                play2.put(paiMark,pai);
            }else {
                //3.4 如果标记的索引%3==2,该标记就给玩家3
                play3.put(paiMark,pai);
            }
        }


        //3.8 展示牌
        System.out.println("play1 = " + play1+","+play1.size());
        System.out.println("play2 = " + play2+","+play2.size());
        System.out.println("play3 = " + play3+","+play3.size());
        System.out.println("diPai = " + diPai);

    }
}
