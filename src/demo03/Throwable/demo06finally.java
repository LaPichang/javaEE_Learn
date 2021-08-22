package demo03.Throwable;

/**
 * finally代码块
 * 格式：
 * try{
 *     //可能产生异常的代码
 * }catch(异常类名 变量名){
 *     //异常的处理逻辑
 * }finally{
 *     //无论是否出现异常都会执行的代码
 * }
 *
 * 注：
 * 1：finally 不能单独使用，必须和 try一起使用
 * 2：finally 一般用于资源释放，无论程序是否出现异常，最后都要资源释放（IO流）
 * 3：finally 中如果有 return语句，则永远返回 finally中的结果
 */

public class demo06finally {
}
