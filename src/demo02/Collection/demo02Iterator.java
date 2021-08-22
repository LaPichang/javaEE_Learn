package demo02.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Iterator接口：迭代器（对集合进行遍历）
 * 两个常用方法：
 * boolean hasNext(); 判断下一个元素是否存在，有则返回ture，没有返回false
 * E next(); 返回迭代的下一个元素，即取出集合中的下一个元素
 * <p>
 * Iterator 是一个接口，所以需要用接口的实现类对象来使用
 * 步骤：调用Collection接口中的iterator();方法，其返回的就是迭代器的实现类对象
 * 格式：Iterator<E> iterator() 返回此 collection 的元素上进行迭代的迭代器
 * <p>
 * 迭代器的使用步骤：
 * 1：使用集合中的方法 iterator() 获取迭代器的实现类对象，使用 Iterator接口接收（多态）
 * 2：使用 Iterator 接口中的方法 hasNext() 判断下一个元素是否存在,并且将指针向后移动
 * 3：使用 Iterator 接口中的方法 next() 取出集合中的下一个元素
 * <p>
 * 增强for循环(foreach)：底层是迭代器，简化了迭代器的写法
 * 所有单列集合都可以使用foreach
 * public interface Iterator<T> 实现这个接口允许对象成为 "foreach"语句的目标
 * 格式： for(集合/数组内的数据类型 变量名:集合名/数组名){
 *     System.out.println(变量名);
 * }
 */

public class demo02Iterator {

    public static void main(String[] args) {

        Collection<String> cod1 = new ArrayList<>();
        Collection<String> cod2 = new ArrayList<>();
        cod1.add("aaa");
        cod1.add("bbb");
        cod1.add("ccc");
        cod2.add("111");
        cod2.add("222");
        cod2.add("333");

        Iterator<String> it1 = cod1.iterator(); //多态写法
        System.out.println("遍历第一个集合");
        while (it1.hasNext()) {
            String e = it1.next();
            System.out.println(e);
        }

        System.out.println("遍历第二个集合");
        for (String s : cod2) {
            System.out.println(s);
        }
    }
}
