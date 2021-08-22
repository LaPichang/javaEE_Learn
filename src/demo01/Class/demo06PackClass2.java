package demo01.Class;

/**
 * 基本类型与字符串之间相互转换：
 *
 * 基本类型 -> 字符串
 * 1：基本类型的值 + ""
 *
 * 2：包装类的静态方法：toString(参数);不是Object类的toString重载
 * static String toString(int i);返回一个指定整数的 String对象
 *
 * 3：String类的静态方法：valueOf(参数);
 * static String valueOf(int i);返回int参数的字符串表示形式
 *
 * 字符串 -> 基本类型
 * 使用包装类的静态方法parseXXX(String s);
 * Integer类： static int parseInt(String s);
 * Double类： static double parseDouble(String s);
 */

public class demo06PackClass2{

    public static void main(String[] args) {

        //基本类型 -> String
        int num1 = 5;
        String str1 = num1 + "" + "2";
        System.out.println(str1 + 0);

        String str2 = Integer.toString(num1);
        String str3 = Integer.toString(2);
        System.out.println(str2 + str3 + 1);

        String str4 = String.valueOf(num1);
        System.out.println(str4 + 55);

        //String -> 基本类型
        String str5 = "3";
        int num2 = Integer.parseInt(str5);
        System.out.println(num2 - 2);
    }
}
