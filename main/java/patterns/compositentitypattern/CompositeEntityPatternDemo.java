package patterns.compositentitypattern;

/**
 * Created by Hoang Phuong on 11/13/2016.
 */
public class CompositeEntityPatternDemo {
    public static void main(String args[]) {
        Client client = new Client();

        client.setData("DATA1", "DATA2");

        client.printData();
    }
}
