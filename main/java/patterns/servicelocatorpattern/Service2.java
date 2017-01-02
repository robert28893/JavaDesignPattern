package patterns.servicelocatorpattern;

/**
 * Created by Hoang Phuong on 11/21/2016.
 */
public class Service2 implements Service {
    public String getName() {
        return "Service2";
    }

    public void execute() {
        System.out.println("Executing " + getName());
    }
}
