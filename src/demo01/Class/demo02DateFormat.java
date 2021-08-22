package demo01.Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.DateFormat:是 日期/时间 格式化子类的抽象类
 * 作用：
 * 格式化（日期 -> 文本），解析（文本 -> 日期）
 * 成员方法：
 * String format(Date date) 按照指定模式将 Date 日期格式化为符合模式的字符串
 * Date parse(String source) 把符合模式的字符串解析为 Date 日期
 * 注：DateFormat 是抽象类，无法直接创建对象使用，可以使用 DateFormat 的子类
 *
 * java.text.SimpleDateFormat extends DateFormat
 *
 * 构造方法：
 * SimpleDateFormat(String pattern) 将指定模式的参数转换为对应日期和时间
 * 注：参数 String pattern 指定模式: (“yyyy-MM-dd HH:mm:ss”)
 * y  年       H  时
 * M  月       m  分
 * d  日       s  秒
 * 注：模式中的字母不能更改，
 *
 * 使用步骤：
 * 1：创建 SimpleDateFormat 对象
 * 2：用SimpleDateFormat对象调用方法
 */

public class demo02DateFormat {

    public static void main(String[] args) throws ParseException {

        method1();
        System.out.println("--------------");
        method2();
    }

    public static void method1(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        System.out.println(date);
        System.out.println(sdf.format(date));
    }

    public static void method2() throws ParseException {
        //parse 方法声明了一个异常，如果参数字符串和构造方法不一样就会抛出异常
        //调用一个抛出了异常的方法就必须处理这个异常
        //用 throws 继续抛出或 try catch 自己处理
        //Alt + Enter 选定“添加异常到方法签名”使用 throws
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
        //此时构造方法中的时间格式以 '.' 为连接符
        Date date = new Date();
        date = sdf.parse("2021.03.18 00.48.00");
        System.out.println(date);
        //date = sdf.parse("2021年03月18日 00时48分00秒");
        //当调用方法格式与构造方法不用，将有异常抛出报错
    }
}
