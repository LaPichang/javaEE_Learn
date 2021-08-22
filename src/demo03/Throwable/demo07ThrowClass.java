package demo03.Throwable;

/**
 * 自定义异常类：
 * 格式：
 * public  class xxxException extends / RuntimeException{
 *     //一个空参构造方法
 *     //一个带有异常信息的构造方法
 * }
 *
 * 注:
 * 1：自定义异常类一般都是以 Exception结尾，说明该类是一个异常类
 * 2：自定义异常类必须继承 Exception 或 RuntimeException
 *           继承 Exception:自定义异常类为一个编译期异常，若方法内部抛出编译期异常则必须手动处理这个异常
 *           继承 RuntimeException:自定义异常类为一个运行期异常，无需手动处理，交由JVM处理
 */

public class demo07ThrowClass extends Exception{

    public demo07ThrowClass(){}

    public demo07ThrowClass(String message){
        super(message);
    }
}
