package patterns.compositentitypattern;

/**
 * Created by Hoang Phuong on 11/13/2016.
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for(String data : compositeEntity.getData()) {
            System.out.println(data);
        }
    }
    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
