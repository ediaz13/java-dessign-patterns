package org.mogul.behavioral.templatemethod;

public class Client {

    public static void main(String[] args) {
        Pizza bbqPizza = new BBQPizza();
        bbqPizza.preparePizza();

        System.out.println("-------------------------------");

        Pizza vegetarianPizza = new VegetarianPizza();
        vegetarianPizza.preparePizza();
    }

}
