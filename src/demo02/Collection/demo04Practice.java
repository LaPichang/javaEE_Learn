package demo02.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 斗地主案例练习
 * 1：准备牌
 * 2：洗牌
 * 3：发牌
 * 4：看牌
 */

public class demo04Practice {

    public static void main(String[] args) {

        //存储54张牌的集合
        ArrayList<String> poker = new ArrayList<String>();

        //存储花色和牌面值的数组
        String[] colors = {"♣","♦","♥","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                poker.add(colors[i] + number[j]);
            }
        }
        poker.add("S_joker");
        poker.add("B_joker");

        //洗牌
        Collections.shuffle(poker);

       //发牌
        ArrayList<String> p1 = new ArrayList<String>();
        ArrayList<String> p2 = new ArrayList<String>();
        ArrayList<String> p3 = new ArrayList<String>();
        ArrayList<String> NPC = new ArrayList<String>();
        for (int i = 0; i < poker.size(); i++) {
            if(i > 51)
                NPC.add(poker.get(i));
            else if (i % 3 == 0)
                p3.add(poker.get(i));
            else if (i % 3 == 1)
                p2.add(poker.get(i));
            else if (i % 3 == 2)
                p1.add(poker.get(i));
        }

        //看牌
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(NPC);
    }
}
