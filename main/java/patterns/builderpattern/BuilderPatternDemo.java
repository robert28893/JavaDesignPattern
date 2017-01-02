package patterns.builderpattern;

/**
 * Created by Hoang Phuong on 10/29/2016.
 */
public class BuilderPatternDemo {
    public static void main(String args[]) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
}
