package demo02.Collection;

public class demo03InterfaceImplA implements demo03GenericInterface <String>{
    @Override
    public void method(String i) {
        System.out.println(i);
    }
}
