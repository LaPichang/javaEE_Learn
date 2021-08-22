package demo02.Collection;

import java.util.LinkedList;

/**
 * java.util.LinkedList 集合 implements List 接口
 * LinkedList 集合的特点：
 * 1：底层是一个链表结构：查询慢，增删快
 * 2：里面包含了大量操作首尾元素的方法
 * 注：使用 LinkListed 集合特有的方法，不能使用多态
 *
 * 常用方法：
 * public boolean add(E e): 将指定元素添加到列表尾部
 * public void add(int index,E e): 将指定元素插入指定位置
 * public void addFirst(E e): 将指定元素插入此列表的开头
 * public void addLast(E e): 将指定的元素添加到此列表的结尾
 * public E getFirst(): 返回此列表的第一个元素
 * public E getLast(): 返回此列表的最后一个元素
 * public E removeFirst(): 移除并返回此列表的第一个元素
 * public E removeLast(): 移除并返回此列表的最后一个元素
 * public boolean isEmpty(): 如果列表不包含元素，则返回 ture
 * public void push(E e): 将元素推入此列表所表示的堆栈
 * public E pop(): 从此列表所表示的堆栈弹出一个元素
 * public void clear(): 清空列表
 */

public class demo06LinkedList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
    }
}
