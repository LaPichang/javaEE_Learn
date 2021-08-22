package demo01.Class;

/**
 * 字符串的底层是一个被final 修饰的数组，是无法改变的常量
 * java.lang.StringBuilder 类：字符串缓冲区，可以提高字符串的操作效率
 * 底层也为数组，但是没有被final修饰，可以改变长度
 * 当字符串内容超出StringBuilder 的长度，将会自动扩容
 *
 * 构造方法：
 * StringBuilder(); 构造一个不带任何字符的字符串生成器，初始容量为16个字符
 * StringBuilder(String str); 构造一个字符串生成器，并初始化为指定字符串内容
 *
 * 常用方法：
 * public StringBuilder append(...); 添加任意数据类型的字符串形式，并返回当前对象（返回值为对象）
 * public String toString(); 将当前的 StringBuilder 对象转换为 String 对象
 *
 * String 和 StringBuilder 可以互相转换：
 * String -> StringBuilder : 使用 StringBuilder 的构造方法
 *            StringBuilder(String str); 构造一个字符串生成器，并初始化为指定字符串内容
 * StringBuilder -> String : 使用 StringBuilder 中的 toString 方法
 *            public String toString(); 将当前 StringBuilder 对象转换为 String 对象
 */

public class demo05StringBuilder {

    public static void main(String[] args) {

        StringBuilder bu1 = new StringBuilder(); //无参构造
        System.out.println("bu1 = " + bu1);

        StringBuilder bu2 = new StringBuilder("wangdefa");
        System.out.println("bu2 = " + bu2);

        System.out.println("----------------------");

        bu1 = bu2.append(" NB!"); //将 bu2 的地址赋给了 bu1
        System.out.println(bu1 == bu2); //引用类型比较的是地址值
        System.out.println(bu1);

        // append 在使用时无需返回值，且可以使用链式编程的方法
        // 链式编程：方法返回值是一个对象，就可以继续调用方法
        bu2.append(" abc").append(1).append(true).append(" 中国 ");
        System.out.println(bu2);
    }
}
