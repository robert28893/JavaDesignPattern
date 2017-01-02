package patterns.bussinessdelegatepattern;

/**
 * Created by Hoang Phuong on 11/13/2016.
 */
public class BusinessDelegatePatternDemo {
    public static void main(String args[]) {
        BusinessDelegate delegate = new BusinessDelegate();
        delegate.setServiceType("EJB");
        Client client = new Client(delegate);

        client.doTask();
    }
}
