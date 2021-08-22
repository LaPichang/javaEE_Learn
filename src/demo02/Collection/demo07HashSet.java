package demo02.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * java.util.Set 接口 extends Collection接口
 * Set接口的特点：
 * 1：不允许存储重复的元素
 * 2：没有索引,没有带索引的方法，也不能使用普通的for循环遍历
 *
 *
 * Set实现类HashSet
 * java.util.HashSet 集合 implements Set 接口
 * HashSet特点：
 * 1：不允许存储重复的元素
 * 2：没有索引，没有带索引的方法，也不能使用普通的for循环遍历
 * 3：是一个无序的集合，存储元素和取出元素的顺序有可能不一致
 * 4：底层是哈希表结构（查询速度非常快）
 * HashSet存储结构：数组 + 链表(链表长度超过八位，将转化为红黑树)  /  数组 + 红黑树（提高查询速度）
 * <p>
 * 哈希值：是一个十进制的整数，由系统随即给出（对象的逻辑地址，是模拟而出，而非实际存储的物理地址）
 * Object 类中 int hashCode() 方法返回对象的哈希值
 * 注：Hashset存储自定义类型元素需要重写 hashCode 和 equals 方法
 *
 *
 * LinkedHashSet集合 extends HashSet 集合
 * LinkedHashSet存储结构：哈希表 + 链表 （在哈希表基础再加链表，记录元素存储顺序，保证元素有序）
 *                      其存储有序且不重复
 */

public class demo07HashSet {

    public static void main(String[] args) {

        //一般类型的存储
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("1");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------------");
        //引用类型的存储
        HashSet<demo07HashImpl> hashes = new HashSet<>();
        demo07HashImpl man1 = new demo07HashImpl("MaErZhaHa", 20);
        demo07HashImpl man2 = new demo07HashImpl("MaErZhaHa", 20);
        hashes.add(man1);
        hashes.add(man2);
        //相同内容的引用类型将不会添加
        System.out.println(hashes);
    }
}
