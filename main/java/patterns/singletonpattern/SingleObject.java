package patterns.singletonpattern;

/**
 * Created by Hoang Phuong on 10/29/2016.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject() {}

    public static SingleObject getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World");
    }
}
