package org.mogul.structural.facade;

public class Comm {
    public void send(String data) {
        System.out.println("Sending data: " + data);
    }

    public void receive() {
        System.out.println("Receiving data.");
    }
}
