package org.mogul.creational.builder;

public class Client {
    public static void main(String[] args) {
        ApartmentBuilder builder = new ApartmentBuilder();

        Apartment ap1 = builder.setSqm(1).setRooms(2).setCity("San Francisco").setArea("California").setKitchen(true).build();
        ap1.display();
    }
}
