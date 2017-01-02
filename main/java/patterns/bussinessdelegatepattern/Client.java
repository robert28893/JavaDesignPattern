package patterns.bussinessdelegatepattern;

/**
 * Created by Hoang Phuong on 11/13/2016.
 */
public class Client {
    private BusinessDelegate delegate;

    public Client(BusinessDelegate delegate) {
        this.delegate = delegate;
    }

    public void doTask() {
        delegate.doTask();
    }
}
