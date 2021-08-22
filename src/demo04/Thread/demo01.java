package demo04.Thread;

/**
 * 创建多线程程序的第一种方式：
 * 1:创建 Thread 的子类
 * 2:在Thread类的子类中重写Thread类中的 run 方法，设置线程任务（开启线程后要做什么）
 * 3:创建Thread类的子类对象
 * 4:调用Thread类中的 start方法，开启新的线程，执行 run 方法
 *
 *
 * 创建多线程程序的第二种方式：
 * 1：创建一个 Runnable接口的实现类
 * 2：在实现类中重写 Runnable接口的 run 方法，设置线程任务
 * 3：创建一个 Runnable接口的实现类对象
 * 4：创建 Thread类对象，构造方法中传递 Runnable接口的实现类对象
 * 5：调用 Thread类中的 start方法，开启新的线程执行 run方法
 *
 * 使用 Runnable接口的好处：
 * 1：避免了的单继承的局限性
 * 2：增强了程序的拓展性，降低了程序的耦合性
 */

public class demo01 {
}
