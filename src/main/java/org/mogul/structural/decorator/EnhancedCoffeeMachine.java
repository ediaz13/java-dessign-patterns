package org.mogul.structural.decorator;

public class EnhancedCoffeeMachine implements CoffeeMachine{

    private NormalCoffeeMachine normalCoffeeMachine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine normalCoffeeMachine) {
        this.normalCoffeeMachine = normalCoffeeMachine;
    }

    //Override Behaviour.
    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced Small Coffee!");
    }

    //Unaltered Behaviour.
    @Override
    public void makeLargeCoffee() {
        normalCoffeeMachine.makeLargeCoffee();
    }

    //Extended Behaviour.
    public void makeMilkCoffee() {
        System.out.println("Enhadec Coffee Machine: Making Milk Coffee");
        normalCoffeeMachine.makeLargeCoffee();
        System.out.println("Enhadec Coffee Machine: Adding Milk");
    }
}
