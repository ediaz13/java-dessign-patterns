package org.mogul.creational.singleton;

public class SingletonLazyTest {
    public static void main(String[] args) {
        SingletonLazy singletonLazyInstance1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazyInstance2 = SingletonLazy.getInstance();

        System.out.println(singletonLazyInstance1);
        System.out.println(singletonLazyInstance2);
    }

}
