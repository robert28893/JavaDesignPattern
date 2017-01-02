package patterns.builderpattern;

/**
 * Created by Hoang Phuong on 10/29/2016.
 */
public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }
}
