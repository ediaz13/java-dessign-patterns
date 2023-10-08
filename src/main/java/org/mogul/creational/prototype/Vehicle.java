package org.mogul.creational.prototype;

public abstract class Vehicle {
    public int wheels;
    public long price;

    public Vehicle() {
    }

    public Vehicle (Vehicle target) {
        if (target != null) {
            this.price = target.price;
            this.wheels = target.wheels;
        }
    }

    public abstract Vehicle clone();

    public abstract boolean isClone(Vehicle target);

}
