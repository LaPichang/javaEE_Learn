package demo03.Throwable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * try...catch:处理异常的第二种方式，自己处理
 * 格式：
 * try{
 *     // 可能产生异常的代码
 * }catch(异常类名 变量名){
 *     // 异常处理逻辑
 * }
 * ...
 * catch(异常类名 变量名){
 *     // ......
 * }
 *
 * 注：
 * 1：try 中可能会抛出多个异常对象，那么就可以使用多个 catch来处理这些异常对象
 * 2：如果 try 中产生了异常，那么就会执行 catch 中的异常处理逻辑
 * 执行完 catch中的处理逻辑，继续执行 try...catch之后的代码
 * 如果try 中没有产生异常，那么就不会执行 catch中的异常处理逻辑
 * 执行完 try 中的代码，继续执行 try...catch 之后的代码
 */

public class demo04trycatch {

    public static void main(String[] args) {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //编译异常
        try {
            Date date = sdf.parse("2021-03-28");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("try/catch 后的代码");
    }
}
