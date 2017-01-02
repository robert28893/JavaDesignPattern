package patterns.factorypattern;

/**
 * Created by Hoang Phuong on 10/28/2016.
 */
public class FactoryPatternDemo {
    public static void main(String args[]) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE);
        Shape s2 = shapeFactory.getShape(ShapeFactory.ShapeType.CIRCLE);
        Shape s3 = shapeFactory.getShape(ShapeFactory.ShapeType.SQUARE);
        s1.draw();
        s2.draw();
        s3.draw();
    }
}
