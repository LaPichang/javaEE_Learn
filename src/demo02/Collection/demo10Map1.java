package demo02.Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map<k,v></>集合
 * Map集合特点：
 * 1：是双列表集合，一个元素包含两个值 (key ，value)
 * 2：Map集合中的元素，key 和 value 的数据类型可以相同也可以不同
 * 3：Map中的元素key是不允许重复的，value是可以重复的
 * 4：Map中的元素key和value 是一一对应的
 *
 * Map实现类：
 * HashMap：
 * 1：HashMap集合底层是哈希表，查询速度快
 * 2：HashMap集合是一个无序的集合，存储元素和取出元素的顺序可能不一致
 *
 * LinkedHashMap：
 * 1：集合底层是 哈希表 + 链表（保证迭代的顺序）
 * 2：是有序集合，存储和取出元素的顺序是一致的
 *
 *
 * 常用方法：
 * public V put (K key, V value): 把指定的 键 与指定的 键值 添加到Map集合中
 *                       key 不重复，返回值 V 是 NULL
 *                       key 重复，会使用新的 value 值替换map中重复的value，返回被替换的value
 *
 * public V remove(Object key): 把指定的 键 所对应的 键值 在Map集合中删除，返回被删除的元素
 *                      key 存在，v返回被删除的数
 *                      key 不存在： v返回NULL
 *
 * public V get(Object key): 获得指定的 键 在Map集合中对应的 键值
 *                      key存在，返回对应的值
 *                      key不存在，返回 NULL
 *
 * boolean containsKey(Object key):判断集合中是否包含指定的键
 *                     包含返回ture,不包含返回false
 */

public class demo10Map1 {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap();
        map.put("WangDeFa",250);
        map.put("Aidehua",520);
        System.out.println(map);
        map.remove("WangDeFa");
        System.out.println(map);
        Integer integer = map.get("Aidehua");
        System.out.println(integer);
        boolean be = map.containsKey("Aidehua");
        System.out.println(be);
    }
}
