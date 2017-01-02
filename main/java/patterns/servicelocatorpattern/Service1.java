package patterns.servicelocatorpattern;

/**
 * Created by Hoang Phuong on 11/21/2016.
 */
public class Service1 implements Service {
    public String getName() {
        return "Service1";
    }

    public void execute() {
        System.out.println("Executing " + getName());
    }
}
