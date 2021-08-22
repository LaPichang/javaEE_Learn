package demo03.Throwable;

import java.util.Scanner;

public class demo07Practice {

    static String[] username = {"NO1","NO2","NO3"};

    public static void main(String[] args) throws demo07ThrowClass {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要注册的用户名");
        String str = scanner.next();
        method(str);
    }

    public static void method(String str) throws demo07ThrowClass {
        for (String s : username) {
            if(s.equals(str)){
                throw new demo07ThrowClass("该用户名已被注册");
            }
        }
        System.out.println("恭喜成功注册");
    }
}
