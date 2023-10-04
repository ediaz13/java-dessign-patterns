package org.mogul.creational.singleton;

public class SingletonThreadSafeTest {
    public static void main(String[] args) {
        SingletonThreadSafe singletonThreadSafeInstance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafeInstance2 = SingletonThreadSafe.getInstance();

        System.out.println(singletonThreadSafeInstance1);
        System.out.println(singletonThreadSafeInstance2);
    }
}
