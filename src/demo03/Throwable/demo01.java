package demo03.Throwable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.lang.Throwable 类是 java语言中所有错误或异常的超类
 *      Exception:编译期异常，进行编译 java程序出现的问题
 *      RuntimeException:运行期异常，java程序运行过程中出现的问题
 *      注:程序异常只要处理后就可以继续运行
 *
 *      Error:错误，需要修改源代码才可继续执行
 *
 *
 * 抛出异常解决方式：
 * 1：使用 try/catch 环绕:处理异常后会继续运行程序
 * 2：添加异常方法签名throws(虚拟机处理):以中断程序的方式处理异常
 *
 *
 * 多异常的处理：
 * 1：多个异常分别处理
 * 2：多个异常一次性捕获，多次处理(一个 try ，多个 catch)
 *    当 catch里定义的异常变量有父子关系，那么子类的异常变量必须写在上面，否则报错
 * 3：多个异常一次捕获，一次处理(catch 中定义的异常变量，能够接收多个不同的异常对象)
 *
 *
 * 父子类异常：
 * 1：子类方法只能抛出父类方法所抛出的异常或者是其子异常，子类构造器必须要抛出父类构造器的异常或者其父异常
 * 2：父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常，此时子类产生该异常，只能捕获处理，不能声明抛出
 */

public class demo01 {

    public static void main(String[] args) /*throws ParseException*/ {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //编译异常
        try {
            Date date = sdf.parse("2021-03-28");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------");
        //运行期异常
        int[] num = new int[3];
        try{
            System.out.println(num[3]); //数组索引越界
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("异常后续代码");
    }
}
