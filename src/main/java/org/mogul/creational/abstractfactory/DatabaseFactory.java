package org.mogul.creational.abstractfactory;

public class DatabaseFactory implements DataSourceAbstractFactory {
    @Override
    public Service creteService() {
        return new DataBaseService();
    }

    @Override
    public Response createResponse() {
        return new DatabaseResponse();
    }
}
