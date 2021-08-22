package demo01.Class;

/**
 * Object 是所有类的超类，所有类都默认继承，所有对象都可使用
 *
 * String toString(类名称);
 * 返回参数类的字符串表达形式
 */

public class demo01ToString {

    public static void main(String[] args) {

        demo01FaceImpl pe = new demo01FaceImpl("WangDefa",19);
        //String spe = pe.toString(); //未重写的 toString 方法返回值为 类 的地址
        System.out.println(pe); //直接打印应用类型，出现的是地址值
        System.out.println("-------------------");

        String hu = pe.toString(); //toString 返回值为 String 类型
        System.out.println(hu);
    }
}
