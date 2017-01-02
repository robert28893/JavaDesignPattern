package patterns.prototypepattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hoang Phuong on 10/30/2016.
 */
public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<String, Shape>();
    public static Shape getShape(String id) {
        Shape shape = shapeMap.get(id);
        return (Shape)shape.clone();
    }

    public static void loadCache() {
        Shape rect = new Rectangle();
        rect.setId("1");
        shapeMap.put(rect.getId(), rect);
        Shape circle = new Circle();
        circle.setId("2");
        shapeMap.put(circle.getId(), circle);
        Shape square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }


}
