package com.itheima.demo12_斗地主案例;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //1.造牌
        //1.1 定义一个扑克盒单列集合,用来存储54张扑克牌
        ArrayList<String> pokerBox = new ArrayList<>();

        //1.2 定义一个花色单列集合,用来存储4个花色
        ArrayList<String> colors = new ArrayList<>();
        colors.add("♠");
        colors.add("♥");
        colors.add("♣");
        colors.add("♦");

        //1.3 定义一个牌面值单列集合用来存储13个牌面值
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        //1.4 往扑克盒集合中添加大小王
        pokerBox.add("大王");
        pokerBox.add("小王");

        //1.5 牌面值集合和花色集合循环嵌套遍历
        for (String number : numbers) {
            for (String color : colors) {
                //1.6 在循环中,利用花色和牌面值拼接成牌,添加到扑克盒集合中
                String pai = color + number;// 字符串拼接
                pokerBox.add(pai);
            }
        }
        System.out.println("pokerBox = " + pokerBox);
        System.out.println("pokerBox = " + pokerBox.size());

        //2.洗牌:
        //2.1 使用Collections.shuffle(List<?> list);方法打乱List集合中元素的顺序
        Collections.shuffle(pokerBox);
        System.out.println("pokerBox = " + pokerBox);
        System.out.println("pokerBox = " + pokerBox.size());

        //3.发牌:
        //3.1 创建4个集合,分别用来存储玩家1,玩家2,玩家3,底牌的牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        //3.2 循环遍历打乱顺序之后的扑克牌
        for (int i = 0; i < pokerBox.size(); i++) {
            //3.3 在循环中,根据索引获取牌
            String pai = pokerBox.get(i);

            //3.4 如果索引>=51,牌给底牌
            if (i >= 51){
                diPai.add(pai);
            } else if (i % 3 == 0) {
                //3.4 如果索引%3==0,牌给玩家1
                player1.add(pai);
            } else if (i % 3 == 1) {
                //3.4 如果索引%3==1,牌给玩家2
                player2.add(pai);
            }else/* if (i % 3 == 2)*/ {
                //3.4 如果索引%3==2,牌给玩家3
                player3.add(pai);
            }
        }

        //3.5 展示牌---打印存储牌的4个集合
        System.out.println("player1 = " + player1+",数量:"+player1.size());
        System.out.println("player2 = " + player2+",数量:"+player2.size());
        System.out.println("player3 = " + player3+",数量:"+player3.size());
        System.out.println("diPai = " + diPai);
    }
}
