package demo02.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List接口 extends Collection 接口
 * List 接口的特点：
 * 1：有序的集合，存储元素和取出元素的顺序是一致的
 * 2：有索引，包含了一些带索引的方法
 * 3：允许存储重复的元素
 *
 * List接口中带索引的方法（特有）
 * public void add(int index,E element): 将指定元素添加到该集合中的指定位置上
 * public E get(int index): 返回集合中指定位置的元素
 * public E remove(int index): 移除列表中指定位置的元素，返回的是被移除的元素
 * public E set(int index,E element): 用指定元素替换集合中指定位置的元素，返回被替换的元素
 * 注：操作索引的时候要注意索引越界的问题
 */

public class demo05List {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("zwc");
        list.add("yj");
        list.add("wzs");
        list.add("lb");
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println("删除某元素后：" + list);
        list.set(0,"wdf");
        System.out.println("替换某个元素后：" + list);
    }
}
