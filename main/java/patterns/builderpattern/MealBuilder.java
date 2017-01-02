package patterns.builderpattern;

/**
 * Created by Hoang Phuong on 10/29/2016.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Coke());
        return vegMeal;
    }

    public Meal prepareNonVegMeal() {
        Meal nonVegMeal = new Meal();
        nonVegMeal.addItem(new ChickenBurger());
        nonVegMeal.addItem(new Pepsi());
        return nonVegMeal;
    }
}
