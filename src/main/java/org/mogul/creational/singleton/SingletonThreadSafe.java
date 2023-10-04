package org.mogul.creational.singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe singletonThreadSafeInstance;

    private  SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance(){
        synchronized (SingletonThreadSafe.class) {
            if (singletonThreadSafeInstance == null) {
                singletonThreadSafeInstance = new SingletonThreadSafe();
            }
        }

        return singletonThreadSafeInstance;
    }
}
