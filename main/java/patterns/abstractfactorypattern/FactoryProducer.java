package patterns.abstractfactorypattern;

import patterns.factorypattern.ShapeFactory;

/**
 * Created by Hoang Phuong on 10/28/2016.
 */
public class FactoryProducer {
    public enum FactoryType {SHAPE, COLOR}
    public static AbstractFactory getFactory(FactoryType type) {
        if(type == FactoryType.SHAPE) {
            return new ShapeFactory();
        } else if(type == FactoryType.COLOR) {
            return new ColorFactory();
        }
        return null;
    }
}
