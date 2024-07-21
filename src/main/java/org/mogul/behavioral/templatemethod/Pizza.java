package org.mogul.behavioral.templatemethod;

public abstract class Pizza {

    public void preparePizza() {
        prepareDough();
        addToppings();
        bake();
        cutIntoSlices();
    }

    private void cutIntoSlices() {
        System.out.println("Cutting pizza into slices...");
    }

    private void bake() {
        System.out.println("Baking pizza...");
    }

    protected abstract void addToppings();

    private void prepareDough() {
        System.out.println("Preparing dough...");
    }

}
