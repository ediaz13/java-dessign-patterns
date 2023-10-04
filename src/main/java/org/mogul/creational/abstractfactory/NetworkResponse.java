package org.mogul.creational.abstractfactory;

public class NetworkResponse implements Response{
    @Override
    public String getResponse() {
        return "Network Service Response!";
    }
}
