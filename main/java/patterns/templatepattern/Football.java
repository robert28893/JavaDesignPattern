package patterns.templatepattern;

/**
 * Created by Hoang Phuong on 11/10/2016.
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football: Initialize");
    }

    @Override
    public void startPlay() {
        System.out.println("Football: Start play");
    }

    @Override
    public void endPlay() {
        System.out.println("Football: End play");
    }
}
