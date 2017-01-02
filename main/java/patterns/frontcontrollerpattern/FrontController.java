package patterns.frontcontrollerpattern;

/**
 * Created by Hoang Phuong on 11/15/2016.
 */
public class FrontController {
    private Dispatcher dispatcher = new Dispatcher();

    public void dispatchRequest(String request) {
        dispatcher.dispatch(request);
    }
}
