package demo02.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection接口：
 * 所有单列集合的最顶层接口，其中定义了所有单列集合共性的方法
 * 任意的单列集合都可以使用Collection接口的方法
 *
 * 常用共性方法：
 * public boolean add(E e); 把给定的对象添加到当前的集合中
 * public void clear(); 清空集合中的所有元素
 * public boolean remove(E e); 把给定的对象在当前集合中删除
 * public boolean contains(E e); 判断当前集合中是否包含给定的对象
 * public boolean isEmpty(); 判断当前集合是否为空
 * public int size(); 返回集合中的元素个数
 * public Object[] toArray(); 把集合中的元素存储到数组中
 */

public class demo01 {

    public static void main(String[] args) {

        Collection<String> cod1 = new ArrayList<>();//多态写法
        cod1.add("520" + 1314); //'+' 连接的内容形成一整个 String 添加入字符串
        cod1.add("1314");
        cod1.add("wangdefa");
        System.out.println(cod1);
        System.out.println("删除1314");
        boolean bool1 = cod1.remove(1314); //参数类型不匹配，删除失败
        System.out.println(bool1);
        System.out.println("删除520");
        boolean bool2 = cod1.remove("520"); //未找到该集合元素，删除失败
        System.out.println(bool2);
        System.out.println("删除1314");
        boolean bool3 = cod1.remove("1314");
        System.out.println(bool3);
        //删除成功返回 ture 失败返回 false
        System.out.println(cod1);
    }
}
