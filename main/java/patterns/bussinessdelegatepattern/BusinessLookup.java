package patterns.bussinessdelegatepattern;

/**
 * Created by Hoang Phuong on 11/13/2016.
 */
public class BusinessLookup {
   public BusinessService getBusinessService(String serviceType) {
       if(serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
       }
       if(serviceType.equalsIgnoreCase("JMS")) {
           return new JMSService();
       }

       return null;
   }
}
