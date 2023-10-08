package org.mogul.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataAdapter implements DataBaseDataConverter{
    @Override
    public List<DisplayData3rdParty> convertData(List<DataBaseData> data) {
        List<DisplayData3rdParty> returnList = new ArrayList<>();
        for (DataBaseData datum : data) {
            float index = datum.position;
            String position = String.valueOf(datum.position);
            DisplayData3rdParty dd3p = new DisplayData3rdParty(index, position);
            returnList.add(dd3p);
        }

        return returnList;
    }
}
