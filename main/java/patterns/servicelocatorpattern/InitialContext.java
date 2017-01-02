package patterns.servicelocatorpattern;

/**
 * Created by Hoang Phuong on 11/21/2016.
 */
public class InitialContext {
    public Service lookup(String serviceName) {
        if(serviceName.equalsIgnoreCase("Service1")) {
            System.out.println("Initial Service Service1");
            return new Service1();
        } else if(serviceName.equalsIgnoreCase("Service2")) {
            System.out.println("Initial Service Service2");
            return new Service2();
        }
        return null;
    }
}
