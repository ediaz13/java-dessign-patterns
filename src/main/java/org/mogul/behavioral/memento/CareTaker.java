package org.mogul.behavioral.memento;

import java.util.ArrayList;

public class CareTaker {
    ArrayList<Memento> mementoArrayList = new ArrayList<>();
    public void saveState(Memento memento) {
        mementoArrayList.add(memento);
    }

    public Memento restoreState(int index) {
        return mementoArrayList.get(index);
    }
}
