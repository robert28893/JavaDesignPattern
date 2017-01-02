package patterns.prototypepattern;

/**
 * Created by Hoang Phuong on 10/30/2016.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
