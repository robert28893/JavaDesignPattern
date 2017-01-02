package patterns.servicelocatorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoang Phuong on 11/21/2016.
 */
public class Cache {
    private List<Service> services;
    public Cache() {
        services = new ArrayList<Service>();
    }
    public Service getService(String serviceName) {
        for(Service service : services) {
            if(service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Get service from Cache");
                return service;
            }
        }
        return null;
    }

    public void addService(Service service) {
        if(!services.contains(service)) {
            services.add(service);
        }
    }

}
