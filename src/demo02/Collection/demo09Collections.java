package demo02.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * java.util.Collections 是集合工具类，用来集合进行操作
 * 部分常用方法：
 * public static <T> boolean addAll(Collection<T> c, T...elements):往集合中添加一些元素
 * public static void shuffle(List<?> List):打乱集合顺序
 * public static <T></T> void sort(List<T></T> list):将集合中的元素按照默认规则排序（升序）
 * public static <T></T> void sort(List<T></T> list, Comparator<? super T>):将集合中的元素按照指定规则排序
 *
 * 注：public (List<T></T> list)使用前提：被排序的集合必须实现Comparable接口，重写接口中的方法，定义排序的规则
 * Comparable接口的排序规则：
 * 自身(this) - 参数 : 升序    参数 - 自身(this) : 降序
 */

public class demo09Collections {

 public static void main(String[] args){

     ArrayList<String> list = new ArrayList<>();
     Collections.addAll(list,"520","13","14");
     System.out.println(list);
     Collections.shuffle(list);
     System.out.println(list);

     System.out.println("---------------------------");

     demo09CollectionsFace pe1 = new demo09CollectionsFace("WangDeFa",19);
     demo09CollectionsFace pe2 = new demo09CollectionsFace("MaErZhaHa",199);
     demo09CollectionsFace pe3 = new demo09CollectionsFace("MaDeHua",20);
     ArrayList<demo09CollectionsFace> listpe = new ArrayList<>();
     Collections.addAll(listpe,pe1,pe2,pe3);
     Collections.sort(listpe);
     System.out.println(listpe);

     System.out.println("---------------------------");

     ArrayList<demo09CollectionsFace> listm = new ArrayList<>();
     listm.add(new demo09CollectionsFace("迪丽热巴",20));
     listm.add(new demo09CollectionsFace("古力娜扎",21));
     listm.add(new demo09CollectionsFace("马尔巴哈",19));
     listm.add(new demo09CollectionsFace("迪丽热巴",19));
     Collections.sort(listm, new Comparator<demo09CollectionsFace>() {
         @Override
         public int compare(demo09CollectionsFace o1, demo09CollectionsFace o2) {
             //按照年龄排序
             int result = o1.getAge() - o2.getAge();
             if(result == 0){
                 //当年龄相同时，比较姓名首字母
                 result = o1.getName().charAt(0) - o2.getName().charAt(0);
             }
             return result;
         }
     });
     System.out.println(listm);
    }
 }


