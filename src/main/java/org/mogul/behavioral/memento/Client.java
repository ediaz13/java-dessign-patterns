package org.mogul.behavioral.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("Initial State");
        CareTaker careTaker = new CareTaker();

        careTaker.saveState(originator.createMemento());
        System.out.println("Current state is: " + originator.state);

        originator.state = "State One";
        careTaker.saveState(originator.createMemento());
        System.out.println("Current state is: " + originator.state);

        originator.state = "State Two";
        careTaker.saveState(originator.createMemento());
        System.out.println("Current state is: " + originator.state);

        System.out.println("------------------------------------");

        originator.restoreMemento(careTaker.restoreState(0));
        System.out.println("Current state is: " + originator.state);
    }
}
