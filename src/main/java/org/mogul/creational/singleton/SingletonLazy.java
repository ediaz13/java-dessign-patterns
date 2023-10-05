package org.mogul.creational.singleton;

import org.mogul.creational.builder.Apartment;

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
