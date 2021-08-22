package demo01.Class;

/**
 * 包装类：把基本数据类型包装起来，在类中定义一些方法。可以使用类中的方法来操作这些基本类型
 *
 * 装箱：将基本数据类型包装到类中
 * Integer 型
 * 构造方法:
 * Integer(int value); 构造一个新的对象分配 Integer 的值，表示指定的 int 值
 * Integer(String s); 构造一个新的对象分配 Integer ，表示 String 参数所指示的 int 值
 * 注：传递字符串必须是对应的基本类型的字符串，否则会抛出异常
 *
 * 静态方法：
 * static Integer valueOf(int i); 返回一个表示指定 int 值的 Integer 实例
 * static Integer valueOf(String s); 返回保存指定 String 值得 Integer 对象
 *
 * 拆箱：在包装类中取出基本类型的数据
 * 成员方法： int intValue(); 以 int 类型返回该 Integer 值
 *
 * 自动装箱：直接把 int 类型的数据赋值给包装类
 * 自动拆箱：直接将包装类的对象参与基本数据类型的运算
 */

public class demo06PackClass {

    public static void main(String[] args) {

        Integer in1 = 520; //自动包装
        System.out.println(in1);

        Integer in2 = new Integer("521"); //用数字字符串作为参数,方法上有横线说明方法过时了
        System.out.println(in2);

        System.out.println("------------------");

        Integer in3 = Integer.valueOf(in1);
        Integer in4 = Integer.valueOf(in2);
        System.out.println(in3 + in4);

        System.out.println("------------------");

        int i = in1.intValue(); //将 in1 从包装类中取出来赋给 i
        System.out.println(i + in2); //自动拆箱
    }
}
