package patterns.templatepattern;

/**
 * Created by Hoang Phuong on 11/10/2016.
 */
public class TemplatePatternDemo {
    public static void main(String args[]) {
        Game football = new Football();
        football.play();
        Game cricket = new Cricket();
        cricket.play();
    }
}