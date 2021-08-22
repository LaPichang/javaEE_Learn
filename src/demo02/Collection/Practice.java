package demo02.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 计算字符串中每个字符出现的次数
 */

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = scanner.next();
        System.out.println("字符个数");
        method(str);
    }

    public static void method(String str){
        Map<Character,Integer> map = new HashMap();
        for (char c : str.toCharArray()) {
            if(map.containsKey(c)){
                //此时代表 map 中已经有相同的字符
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }
            else{
                //该字符第一次出现
                map.put(c,1);
            }
        }
        for (Character character : map.keySet()) {
            Integer value = map.get(character);
            System.out.println(character + "=" + value);
        }
    }
}
