package patterns.bridgepattern;

/**
 * Created by Hoang Phuong on 10/30/2016.
 */
public class BridgePatternDemo {
    public static void main(String args[]) {
        DrawAPI drawAPI = new RedCircle();
        Shape circle = new Circle(5, 4, 3, drawAPI);
        circle.draw();
        Shape greenCircle = new Circle(50, 20, 30, new GreenCircle());
        greenCircle.draw();
    }
}
