package patterns.abstractfactorypattern;

import patterns.factorypattern.Shape;
import patterns.factorypattern.ShapeFactory;

/**
 * Created by Hoang Phuong on 10/28/2016.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String args[]) {
        /*Create ShapeFactory & ColorFactory*/
        AbstractFactory sf = FactoryProducer.getFactory(FactoryProducer.FactoryType.SHAPE);
        AbstractFactory cf = FactoryProducer.getFactory(FactoryProducer.FactoryType.COLOR);

        /*Create Shapes*/
        Shape rect = sf.getShape(ShapeFactory.ShapeType.RECTANGLE);
        Shape cir = sf.getShape(ShapeFactory.ShapeType.CIRCLE);
        Shape squa = sf.getShape(ShapeFactory.ShapeType.SQUARE);
        /*Create Colors*/
        Color red = cf.getColor(ColorFactory.ColorType.RED);
        Color green = cf.getColor(ColorFactory.ColorType.GREEN);
        Color blue = cf.getColor(ColorFactory.ColorType.BLUE);

        rect.draw();
        cir.draw();
        squa.draw();

        red.fill();
        green.fill();
        blue.fill();
    }
}
