package demo02.Collection;

/**
 * 定义一个含有泛型的接口
 * 使用方式：
 * 1：泛型类型由实现类决定
 * public class 实现类 implements 接口 <泛型的具体类型>{
 *     实现类...
 * }
 *
 *
 * 2：接口主导泛型的类型，创建对象的时候决定泛型的类型
 * public class 实现类 <E> implements 接口 <E>{
 *     实现类...
 * }
 *
 */

public interface demo03GenericInterface <E>{

    public abstract void method(E i);
}
