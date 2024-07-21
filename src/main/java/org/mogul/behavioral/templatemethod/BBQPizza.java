package org.mogul.behavioral.templatemethod;

public class BBQPizza extends Pizza {
    @Override
    protected void addToppings() {
        System.out.println("Adding meat, BBQ sauce and cheese...");
    }
}
