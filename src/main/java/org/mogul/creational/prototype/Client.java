package org.mogul.creational.prototype;

public class Client {
    public static void main(String[] args) {
        Vehicle c1 = new Car(4, 30000, "red");
        Vehicle c2 = c1.clone();

        c1.isClone(c2);
        c2.isClone(c1);

        Vehicle b1 = new Bicycle(2, 10000, true);
        Vehicle b2 = b1.clone();

        b1.isClone(b2);
        b2.isClone(b1);

        b1.isClone(c2);



    }
}
