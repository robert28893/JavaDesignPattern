package patterns.bussinessdelegatepattern;

/**
 * Created by Hoang Phuong on 11/13/2016.
 */
public class EJBService implements BusinessService {
    public void doProcessing() {
        System.out.println("Take invoking EJB service");
    }
}
