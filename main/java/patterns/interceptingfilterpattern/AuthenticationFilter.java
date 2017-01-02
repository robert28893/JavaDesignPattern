package patterns.interceptingfilterpattern;

/**
 * Created by Hoang Phuong on 11/21/2016.
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authentication Filter: " + request);
    }
}
