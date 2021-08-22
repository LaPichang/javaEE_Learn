package demo01.Class;

import java.util.Objects;

public class demo01FaceImpl {

    //默认继承 Object 类，所以可以使用 toString 方法
    private String name;
    private int num;

    public demo01FaceImpl(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public demo01FaceImpl() {
    }

    //对 toString 方法进行覆盖重写0
    @Override
    public String toString() {
        return "demo01FaceImpl{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //(this == o)使用反射技术，等效于 (o instanceof demo01FaceImpl)
        if (o == null || getClass() != o.getClass()) return false;
        demo01FaceImpl that = (demo01FaceImpl) o;
        return num == that.num && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
