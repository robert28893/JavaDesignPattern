package patterns.bridgepattern;

/**
 * Created by Hoang Phuong on 10/30/2016.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
