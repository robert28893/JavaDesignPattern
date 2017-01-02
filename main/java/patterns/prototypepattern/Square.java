package patterns.prototypepattern;

/**
 * Created by Hoang Phuong on 10/30/2016.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
