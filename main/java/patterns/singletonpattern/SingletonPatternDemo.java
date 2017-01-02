package patterns.singletonpattern;

/**
 * Created by Hoang Phuong on 10/29/2016.
 */
public class SingletonPatternDemo {
    public static void main(String args[]) {
        SingleObject single = SingleObject.getInstance();
        single.showMessage();
    }
}
