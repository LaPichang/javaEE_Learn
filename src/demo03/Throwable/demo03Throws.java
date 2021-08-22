package demo03.Throwable;

/**
 * throws关键字：异常处理的第一种方式（交由系统处理）
 * 格式：
 * 修饰符 返回值类型 方法名(参数列表) throws AAAException,BBBException...{
 *     throw new AAAException("message...");
 *     throw new BBBException("message...");
 *     ...
 * }
 *
 * 注：
 * 1：throws 关键字必须写在方法声明处
 * 2：throws 关键字后面声明的异常必须是 Exception 或 Exception的子类
 * 3：方法内部如果抛出多个异常对象，那么 throws 后面必须也声明多个异常
 *    如果抛出的异常是继承关系，则直接声明父类异常即可
 * 4：调用了一个声明抛出异常的方法就必须处理声明的异常，使用 throws声明抛出或 try...catch 自己处理
 */

public class demo03Throws {

}
