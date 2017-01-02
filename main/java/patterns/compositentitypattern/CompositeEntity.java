package patterns.compositentitypattern;

/**
 * Created by Hoang Phuong on 11/13/2016.
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public String[] getData() {
       return cgo.getData();
    }

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

}
