package demo02.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map 集合的遍历方式：
 * 1：通过键找值：
 * Map集合中的方法 Set<K></K> keySet() :返回此映射中包含的键的 Set视图
 * 步骤：
 * 使用 Map集合中的方法 keySet()把 Map集合所有的 key取出来，存储到一个 set集合中
 * 遍历 set集合，获取 Map集合中的每一个 key
 * 利用 Map集合的方法 get(key)，通过 key找到 value
 *
 * 2：使用 Entry 对象遍历
 * Map集合中的方法 Set<Map.Entry<K,V>> entrySet():返回此映射中包含的映射关系的 Set图
 * 步骤：
 * 使用 Map集合中的方法 entrySet()把 Map集合中多个 Entry对象取出来，存储到一个 Set集合中
 * 遍历 Set集合，获取每一个 Entry对象
 * 使用 Entry对象中的方法 getKey()和 getValue()获取键与值
 */

public class demo10Map2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("王得发", 180);
        map.put("爱德华", 190);
        map.put("刘德华", 200);

        Set<String> set = map.keySet();

        for (String s : set) {
            Integer value = map.get(s);
            System.out.println(s + "=" + value);
        }

        //不建立新 Set 对象写法
        for (String s : map.keySet()) {
            Integer value = map.get(s);
            System.out.println(s + "=" + value);
        }

        System.out.println("--------------------------------");

        Set<Map.Entry<String, Integer>> set1 = map.entrySet();

        for (Map.Entry<String, Integer> stringIntegerEntry : set1) {
            String key = stringIntegerEntry.getKey();
            Integer value = stringIntegerEntry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}