package org.mogul.structural.composite;

import java.util.ArrayList;

public class Composite extends Equipment {
    private ArrayList<Equipment> listEquipments = new ArrayList<>();

    public Composite(String name) {
        super(name, 0);
    }

    public Composite add(Equipment equipment) {
        listEquipments.add(equipment);
        return this;
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (Equipment equipment : listEquipments) {
            sum += equipment.getPrice();
        }

        return sum;
    }

}
