package org.mogul.creational.singleton;

public class SingletonLazy {
    private static SingletonLazy singletonLazyInstance;

    private SingletonLazy() {
    }


    public static SingletonLazy getInstance() {
        //Problem with Threads
        if (singletonLazyInstance == null) {
            singletonLazyInstance = new SingletonLazy();
        }

        return singletonLazyInstance;
    }

}
