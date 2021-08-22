package demo02.Collection;

import java.util.List;

/**
 * 静态方法 of ：给集合一次添加多个元素
 * 前提：当集合中需要存储的元素个数以及确定且不再改变时使用 of
 * 注：
 * 1：of方法只适用于 List接口 Set接口 Map接口 ，不适用于接口的实现类
 * 2：of方法的返回值是一个不能改变的集合，集合不能再使用 add ,put 方法添加元素，否则抛出异常
 * 3：Set接口和 Map接口在调用 of方法的时候，不能有重复的元素，否则抛出异常
 *
 *
 * Debug: 让代码逐行执行
 * 使用方法：
 *        在行号处点击鼠标左键添加断点
 *        “调试” 程序检查断点
 * 执行程序：
 *        f7:进入方法中
 *        f8:逐行执行程序
 *        f9:跳到下一个断点，没有则跳出程序
 *        shift + f8:跳出方法
 *        ctrl + f2:退出debug模式，停止程序
 */

public class demo11OfandDebug {

    public static void main(String[] args) {

        List<String> str = List.of("a","b","c");
        System.out.println(str);

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1);
        }
    }
}
