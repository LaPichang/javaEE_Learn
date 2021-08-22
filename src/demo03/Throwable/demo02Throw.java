package demo03.Throwable;

import java.util.Objects;

/**
 * throw关键字：可以在指定方法中抛出指定的异常
 * 格式：
 *    throw new xxxException("产生异常的原因");
 * 注：
 *   1：throw关键字必须写在方法的内部
 *   2：throw关键字后面new 的对象必须是 Exception或者 Exception的子类对象
 *   3：throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
 *     throw关键字后面创建的是RuntimeException 或者RuntimeException的子类对象，可以不手动处理
 *           交由 JVM(java 虚拟机)处理
 *     throw关键字后面创建的是编译异常，必须手动处理 (throws 或 try...catch)
 *
 * Objects类中的静态方法：
 * public static <T></T> T requireNonNull(T obj,String message):查看指定引用对象是否为 null
 */

public class demo02Throw {

    public static void main(String[] args) {

        int[] arr = null;
        Objects.requireNonNull(arr,"传递的对象为null");
        //method(arr);
    }

    public static void method(int[] arr){
        if(arr == null){
            throw new NullPointerException("传递的数组为null");
        }
    }
}
