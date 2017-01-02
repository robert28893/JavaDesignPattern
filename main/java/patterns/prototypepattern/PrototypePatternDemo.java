package patterns.prototypepattern;

/**
 * Created by Hoang Phuong on 10/30/2016.
 */
public class PrototypePatternDemo {
    public static void main(String args[]) {
        ShapeCache.loadCache();

        Shape rect = ShapeCache.getShape("1");
        System.out.println("Shape: " + rect.getType());

        Shape circle = ShapeCache.getShape("2");
        System.out.println("Shape: " + circle.getType());

        Shape square = ShapeCache.getShape("3");
        System.out.println("Shape: " + square.getType());

    }

}
