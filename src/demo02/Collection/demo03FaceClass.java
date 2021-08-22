package demo02.Collection;

/**
 * 定义一个含有泛型的类。模拟 ArrayList 集合
 * 泛型是一个未知的数据类型，当不确定使用哪种类型的数据时，可以用泛型来定义
 * 创建对象的时候再确定泛型的数据类型
 *
 * 格式：
 * public class 类名称<E>
 */

public class demo03FaceClass<E> {

    private E name;

    public demo03FaceClass(E name) {
        this.name = name;
    }

    public demo03FaceClass() {
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
