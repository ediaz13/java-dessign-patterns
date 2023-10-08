package org.mogul.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DataBaseDataGenerator {
    public List<DataBaseData> generatedData() {
        List<DataBaseData> list = new ArrayList<>();
        list.add(new DataBaseData(2, 2));
        list.add(new DataBaseData(3, 1));
        list.add(new DataBaseData(4, 23));
        return list;
    };

}
