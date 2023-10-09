package org.mogul.structural.decorator;

public class NormalCoffeeMachine implements CoffeeMachine{

    @Override
    public void makeSmallCoffee() {
        System.out.println("Sexy Small Coffee");
    }

    @Override
    public void makeLargeCoffee() {
        System.out.println("Sexy Large Coffee");
    }
}
