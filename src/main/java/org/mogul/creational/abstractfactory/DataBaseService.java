package org.mogul.creational.abstractfactory;

public class DataBaseService implements Service {

    @Override
    public String runService() {
        return "Database Service Running!";
    }
}
