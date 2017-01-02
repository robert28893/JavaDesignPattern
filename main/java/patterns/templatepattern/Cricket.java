package patterns.templatepattern;

/**
 * Created by Hoang Phuong on 11/10/2016.
 */
public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket: Initialize");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket: Start play");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket: End play");
    }
}
