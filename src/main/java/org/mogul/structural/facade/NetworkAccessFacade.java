package org.mogul.structural.facade;

public class NetworkAccessFacade {
    private Comm comm = new Comm();
    private Interceptor interceptor = new Interceptor();
    private Cache cache = new Cache();
    private Convertor conv = new Convertor();


    public void communicate() {
        cache.cache();
        comm.send("Some important data.");
        comm.receive();
        interceptor.intercept();
        conv.convert();
    }
}
