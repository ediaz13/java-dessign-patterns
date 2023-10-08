package org.mogul.structural.adapter;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        DataBaseDataGenerator  gen = new DataBaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();

        List<DisplayData3rdParty> legacyData = adapter.convertData(gen.generatedData());

        for (DisplayData3rdParty datum : legacyData) {
            datum.displayData();
        }

    }
}
