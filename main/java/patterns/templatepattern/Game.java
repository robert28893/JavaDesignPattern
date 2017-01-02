package patterns.templatepattern;

/**
 * Created by Hoang Phuong on 11/10/2016.
 */
public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
