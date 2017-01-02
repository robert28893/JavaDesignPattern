package patterns.interceptingfilterpattern;

/**
 * Created by Hoang Phuong on 11/21/2016.
 */
public class Target {
    public void execute(String request) {
        System.out.println("Target: " + request);
    }
}
