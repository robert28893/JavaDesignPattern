package patterns.bussinessdelegatepattern;

/**
 * Created by Hoang Phuong on 11/13/2016.
 */
public class JMSService implements BusinessService {
    public void doProcessing() {
        System.out.println("Take invoking a JSM service");
    }
}
