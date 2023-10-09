package org.mogul.structural.decorator;

public class Client {
    public static void main(String[] args) {
        NormalCoffeeMachine normalMachine = new NormalCoffeeMachine();
        EnhancedCoffeeMachine enhancedMachine = new EnhancedCoffeeMachine(normalMachine);

        normalMachine.makeSmallCoffee();
        normalMachine.makeLargeCoffee();

        enhancedMachine.makeSmallCoffee();
        enhancedMachine.makeLargeCoffee();
        enhancedMachine.makeMilkCoffee();
    }
}
