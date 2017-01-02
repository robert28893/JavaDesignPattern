package patterns.abstractfactorypattern;

import patterns.factorypattern.Shape;
import patterns.factorypattern.ShapeFactory;

/**
 * Created by Hoang Phuong on 10/28/2016.
 */
public class ColorFactory extends AbstractFactory{
    public enum ColorType {RED, GREEN, BLUE};
    @Override
    public Color getColor(ColorType color) {
        if(color == ColorType.RED) {
            return new Red();
        } else if(color == ColorType.GREEN) {
            return new Green();
        } else if(color == ColorType.BLUE) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(ShapeFactory.ShapeType type) {
        return null;
    }
}
