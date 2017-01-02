package patterns.abstractfactorypattern;

import patterns.factorypattern.Shape;
import patterns.factorypattern.ShapeFactory;

/**
 * Created by Hoang Phuong on 10/28/2016.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(ColorFactory.ColorType color);
    public abstract Shape getShape(ShapeFactory.ShapeType type);
}
