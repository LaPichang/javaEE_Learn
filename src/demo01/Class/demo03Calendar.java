package demo01.Class;

import java.util.Calendar;

/**
 * java.util.Calendar类:日历类
 * Calendar 类抽象类，提供操作日历字段的方法
 * Calendar 类无法直接创建对象使用，需要用其中的一个静态方法getInstance()返回其中的子类对象
 * 格式：
 * Calendar 对象名 = Calendar.getInstance();
 * static Calendar getInstance(); 使用默认时区和语言环境获得一个日历
 *
 * 常用方法：
 * public int get(int field); 返回给定的日历字段的值
 * public void set(int field, int value); 将给定的日历字段设置参数给定值
 * public abstract void add(int field, int amount); 根据日历规则，为日历添加或删去指定的时间量
 * public Date getTime(); 返回一个表示此 Calendar 时间值（从历元到现在毫秒偏移量）的Date对象
 */

public class demo03Calendar {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance(); //多态写法
        System.out.println(c);
    }
}
