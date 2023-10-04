package org.mogul.creational.singleton;

public class SingletonBillPughTest {
    public static void main(String[] args) {
        SingletonBillPugh singletonBillPughInstance1 = SingletonBillPugh.getInstance();
        SingletonBillPugh singletonBillPughInstance2 = SingletonBillPugh.getInstance();

        System.out.println(singletonBillPughInstance1);
        System.out.println(singletonBillPughInstance2);
    }
}
