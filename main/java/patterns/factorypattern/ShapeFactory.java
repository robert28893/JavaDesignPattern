package patterns.factorypattern;


import patterns.abstractfactorypattern.AbstractFactory;
import patterns.abstractfactorypattern.Color;
import patterns.abstractfactorypattern.ColorFactory;

/**
 * Created by Hoang Phuong on 10/28/2016.
 */
public class ShapeFactory extends AbstractFactory{
    public enum ShapeType {CIRCLE, SQUARE, RECTANGLE}

    @Override
    public Shape getShape(ShapeType type) {
        if(type == ShapeType.CIRCLE) {
            return new Circle();
        } else if(type == ShapeType.RECTANGLE) {
            return new Rectangle();
        } else if(type == ShapeType.SQUARE) {
            return new Square();
        }
        return null;
    }
    @Override
    public Color getColor(ColorFactory.ColorType color) {
        return null;
    }

}
