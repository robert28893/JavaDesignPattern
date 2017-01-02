package patterns.frontcontrollerpattern;

/**
 * Created by Hoang Phuong on 11/15/2016.
 */
public class FrontControllerPattern {
    public static void main(String args[]) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("Home");
        frontController.dispatchRequest("Student");
    }
}
