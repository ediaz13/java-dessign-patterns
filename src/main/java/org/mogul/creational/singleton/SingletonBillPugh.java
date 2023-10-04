package org.mogul.creational.singleton;

public class SingletonBillPugh {
    private SingletonBillPugh() {
    }

    private static class InnerStaticClass {
        private static final SingletonBillPugh singletonBillPughInstance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return InnerStaticClass.singletonBillPughInstance;
    }
}
