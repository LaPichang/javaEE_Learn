package demo01.Class;

import java.util.Date;

/**
 * java.util.Date:表示日期和时间的类
 * 类 Date 表示特定的瞬间，精确到毫秒(千分之一秒)
 * 可将日期转化为毫秒计算，再将计算结果转化为日期
 *
 * 时间原点：1970 年 1 月 1 日 00:00:00 (英国格林威治)
 * 注：中国属于东八区，时间原点增加八个小时
 *
 * 格式：
 * Date 对象名 = new Date();
 *
 * Date 的无参构造: 返回当前时间（中国时间）
 * Date 的有参构造: 将参数(long date)毫秒值返回为Date日期
 *
 */

public class demo02Date {

    public static void main(String[] args) {

        method1();
        method2();
    }

    public static void method1(){
        Date date = new Date();
        System.out.println(date);
    }

    public static void method2(){
        Date date = new Date(123456567);
        System.out.println(date);
    }
}
