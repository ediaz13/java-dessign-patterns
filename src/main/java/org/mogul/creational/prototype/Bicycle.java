package org.mogul.creational.prototype;

public class Bicycle extends Vehicle {

    private boolean cityBike;

    public Bicycle(int wheels, long price, boolean cityBike) {
        this.price = price;
        this.wheels = wheels;
        this.cityBike = cityBike;
    }

    public Bicycle(Bicycle target) {
        super(target);
        if (target != null) {
            this.cityBike = target.cityBike;
        }
    }

    @Override
    public Vehicle clone() {
        return new Bicycle(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (target instanceof Bicycle) {
            Bicycle t = (Bicycle) target;

            if (price == t.price && wheels == t.wheels && cityBike == t.cityBike) {
                System.out.println(this + " and " + t + " are clones.");
                return true;
            }
        }

        System.out.println(this + " and " + target + " are NOT clones.");
        return false;
    }
}
