package demo02.Collection;

public class demo03InterfaceImplB<E> implements demo03GenericInterface<E>{
    @Override
    public void method(E i) {
        System.out.println(i);
    }
}
