package demo02.Collection;

/**
 * 可变参数：当方法参数列表已经确定，但不能确定参数个数时使用
 * 格式：
 * 修饰符 返回值类型 方法名(数据类型...变量名){
 *     //方法体
 * }
 *
 * 原理：可变参数底层原理为数组，根据传递参数的不同会创建不同长度的数组
 *
 * 注：
 * 1：一个方法的参数列表只能有一个可变参数
 * 2：如果方法的参数有多个，可变参数一定要写在参数列表的末尾
 *
 */

public class demo08VarArgs {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i+1;
        }
        System.out.println(sum);
    }

    public static int Add(int...num){
        //此时 num 为数组
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
}
