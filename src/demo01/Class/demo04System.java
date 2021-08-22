package demo01.Class;

import java.util.Arrays;

/**
 * java.lang.System 类中提供了大量的静态方法，可以获取与系统相关的信息或者系统级操作
 * 常用方法：
 * public static long currentTimeMiLLis();返回以毫秒为单位的当前时间
 * public static void arraycopy(Object src, int Object, int dest, int destPos, int Length);
 * 将数组中指定的数据拷贝到另一个数组中
 * 注：参数含义
 * src - 源数组。
 * srcPos - 源数组中的起始位置。
 * dest - 目标数组。
 * destPos - 目标数据中的起始位置。
 * length - 要复制的数组元素的数量。
 */

public class demo04System {

    public static void main(String[] args) {

        method1();
        method2();
    }

    public static void method1(){
        //在程序前后各获取一次毫秒值，以测量程序的效率
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("该方法运行时间为：" + (time2 - time1)); //毫秒
    }

    public static void method2(){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        System.out.println("复制前" + Arrays.toString(array1));
        //使用arraycopy 方法把数组 array1 的前三个元素复制到数组 array2 的前三个位置上
        System.arraycopy(array1,0,array2,0,3);
        System.out.println("复制后" + Arrays.toString(array2));
    }
}
