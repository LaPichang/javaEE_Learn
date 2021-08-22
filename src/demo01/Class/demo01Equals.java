package demo01.Class;

/**
 * Object 中的 Equals 方法，比较的是两个对象的地址值
 * 相比 String 中的 str1.equals(str2); 方法
 * Object.equals(对象名,对象名); 可以防止空指针异常
 * 将 Equals 覆盖重写，使其比较两个对象的属性
 */

public class demo01Equals {

    public static void main(String[] args) {

        demo01FaceImpl pe = new demo01FaceImpl();

    }
}
