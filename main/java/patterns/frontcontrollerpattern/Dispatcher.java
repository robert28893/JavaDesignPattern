package patterns.frontcontrollerpattern;

/**
 * Created by Hoang Phuong on 11/15/2016.
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("HOME")) {
            homeView.show();
        } else if(request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        }
    }
}
