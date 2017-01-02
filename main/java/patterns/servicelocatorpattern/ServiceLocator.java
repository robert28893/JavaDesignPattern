package patterns.servicelocatorpattern;

/**
 * Created by Hoang Phuong on 11/21/2016.
 */
public class ServiceLocator {
    private static Cache cache = new Cache();

    public static Service getService(String serviceName) {
        Service service = cache.getService(serviceName);
        if(service != null) {
            return service;
        }
        InitialContext initialContext = new InitialContext();
        service = initialContext.lookup(serviceName);
        if(service != null) {
            cache.addService(service);
        }
        return service;
    }
}
