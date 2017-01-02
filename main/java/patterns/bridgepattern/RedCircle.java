package patterns.bridgepattern;

/**
 * Created by Hoang Phuong on 10/30/2016.
 */
public class RedCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
