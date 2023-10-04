package org.mogul.creational.abstractfactory;

public class NetworkFactory implements DataSourceAbstractFactory {
    @Override
    public Service creteService() {
        return new NetworkService();
    }

    @Override
    public Response createResponse() {
        return new NetworkResponse();
    }
}
