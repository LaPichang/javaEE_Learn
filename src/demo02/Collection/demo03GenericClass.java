package demo02.Collection;

import java.util.ArrayList;

/**
 * 创建集合对象不使用泛型：
 * 优点：集合默认为 Object 类型，可以存储任意类型的数据
 * 弊端：不安全，会引发异常
 *
 * 定义含有泛型的方法：泛型定义在方法的修饰符和返回值类型之间
 * 格式：
 * 修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
 *     方法体...
 * }
 * 含有泛型的方法，在调用方法的时候确定泛型的数据类型
 * 所传递参数的类型就是泛型的类型
 *
 *
 * 泛型的通配符：'?'
 * 代表任意类型的数据
 * 使用方法：只能作为参数，不能创建对象使用
 * 注：泛型没有继承的概念
 * 泛型的上限限定： ? extends E 代表使用的泛型只能是E类型的子类/本身
 * 泛型的下限限定： ? super E   代表使用的泛型只能是E类型的父类/本身
 */

public class demo03GenericClass <E>{

    public static void main(String[] args) {

        ArrayList array = new ArrayList();
        array.add("Wangdefa");
        array.add(20);
        System.out.println(array);
        //没使用泛型可以存储不同类型的数据，但无法使用相应类的方法
        System.out.println("------------------------------");

        //含有泛型的类
        demo03FaceClass<String> pe = new demo03FaceClass<>();
        //创建对象时确定泛型所代表类型
        pe.setName("Liudehua");
        System.out.println(pe.getName());
        System.out.println("------------------------------");

        //含有泛型的方法
        method1("Wangbadan");
        System.out.println("------------------------------");

        //含有泛型的接口
        //用法一
        demo03InterfaceImplA face1 = new demo03InterfaceImplA();
        face1.method("Jianggang");
        //用法二
        demo03InterfaceImplB<Integer> face2 = new demo03InterfaceImplB<Integer>();
        face2.method(5201314);
        System.out.println("------------------------------");


        //泛型通配符使用
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(520);
        list1.add(521);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("NB");
        list2.add("ZWC");

        method2(list1);
        method2(list2);
    }

    public static <E> void method1(E e){
        System.out.println(e);
    }

    public static void method2(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
