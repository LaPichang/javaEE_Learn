package demo02.Collection;

public class demo09CollectionsFace implements Comparable<demo09CollectionsFace>{

    private String name;
    private int age;

    @Override
    public String toString() {
        return "demo09CollectionsFace{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public demo09CollectionsFace(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public demo09CollectionsFace() {
    }

    @Override
    public int compareTo(demo09CollectionsFace o) {
        //自定义年龄为比较元素
        return this.getAge() - o.getAge();
    }
}
