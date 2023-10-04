package org.mogul.singleton;

public class SingletonEagerTest {
    public static void main(String[] args) {
        SingletonEager singletonEagerInstance1 = SingletonEager.getEagerInstance();
        SingletonEager singletonEagerInstance2 = SingletonEager.getEagerInstance();

        System.out.println(singletonEagerInstance1);
        System.out.println(singletonEagerInstance2);
    }
}
