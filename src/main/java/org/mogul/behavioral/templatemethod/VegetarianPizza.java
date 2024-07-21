package org.mogul.behavioral.templatemethod;

public class VegetarianPizza extends Pizza {
    @Override
    protected void addToppings() {
        System.out.println("Adding onion, peppers and cheese...");
    }
}
