package patterns.bussinessdelegatepattern;

/**
 * Created by Hoang Phuong on 11/13/2016.
 */
public class BusinessDelegate {
    private BusinessLookup lookup = new BusinessLookup();
    private BusinessService service;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        service = lookup.getBusinessService(serviceType);
        service.doProcessing();
    }
}
